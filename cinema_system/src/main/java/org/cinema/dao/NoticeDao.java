package org.cinema.dao;

import org.domian.entity.Notice;

import java.util.List;

/**
 * Created by LIANG on 2017/3/30.
 */
public interface NoticeDao extends BaseDao<Notice>{
    public List<Notice> findNoticeList();
}
