package org.cinema.dao;

import java.io.Serializable;

/**
 * Created by LIANG on 2017/2/27.
 */
public interface BaseDao<T> {
    /**
     * 添加
     * @param t
     */
    public void save(T t);

    /**
     * 删除
     * @param t
     */
    public void delete(T t);

    /**
     * 更新
     * @param t
     */
    public void update(T t);

    /**
     * 根据id查询
     * @param entityClass 实体
     * @param id id
     * @return
     */
    public T findById(Class<T> entityClass, Serializable id);
}
