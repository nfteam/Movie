package org.cinema.action;

import org.cinema.dao.UpdatePassword;
import org.domian.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LIANG on 2017/3/28.
 */
@Transactional(propagation = Propagation.REQUIRED)
@Controller("passwordAction")
@Scope("prototype")
public class PasswordAction {
    @Autowired
    private UpdatePassword updatePassword;
    private Manager manager;
    private String message;
    private String newPas;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNewPas() {
        return newPas;
    }

    public void setNewPas(String newPas) {
        this.newPas = newPas;
    }

    public String update(){
        manager.setPassword(newPas);
        manager.setManId("1");
        int n=updatePassword.updatePassword(manager);
        message = n > 0  ? "修改成功": "修改失败";
        return "success";
    }
}
