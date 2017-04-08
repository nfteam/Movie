package org.cinema.dao.impl;

import org.cinema.dao.UpdatePassword;
import org.domian.entity.Manager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LIANG on 2017/3/28.
 */
@Repository("passwordDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UpdatePassowrdImpl extends BaseDaoImpl<Manager> implements UpdatePassword {
    @Override
    public int updatePassword(Manager manager) {
        String hql="update from Manager m set m.password=?1 where m.manId=?2";
        return em.createQuery(hql).setParameter(1,manager.getPassword()).setParameter(2,manager.getManId()).executeUpdate();
    }
}
