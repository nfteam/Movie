package org.cinema.dao.impl;

import org.cinema.dao.NoticeDao;
import org.domian.entity.Notice;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LIANG on 2017/3/30.
 */
@Repository("noticeDao")
@Transactional(propagation = Propagation.REQUIRED)
public class NoticeDaoImpl extends BaseDaoImpl<Notice> implements NoticeDao {
    @Override
    public List<Notice> findNoticeList() {
        String hql="from Notice";
        return em.createQuery(hql,Notice.class).getResultList();
    }
}
