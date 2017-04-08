package org.cinema.action;

import org.cinema.dao.NoticeDao;
import org.domian.entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by LIANG on 2017/3/30.
 */
@Controller("noticeAction")
@Scope("prototype")
public class NoticeAction {

    @Autowired
    private NoticeDao dao;
    private List<Notice> list;
    private Notice notice;

    public Notice getNotice() {
        return notice;
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

    public List<Notice> getList() {
        return list;
    }

    public void setList(List<Notice> list) {
        this.list = list;
    }

    public String findNoticeList(){
        list=dao.findNoticeList();
        return "success";
    }

    public String findNoticeById(){
        notice=dao.findById(Notice.class,notice.getNoticeId());
        return "success";
    }
}
