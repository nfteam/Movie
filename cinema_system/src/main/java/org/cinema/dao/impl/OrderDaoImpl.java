package org.cinema.dao.impl;

import org.cinema.dao.OrderDao;
import org.domian.entity.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * Created by LIANG on 2017/3/31.
 */
@Repository("orderDao")
@Transactional(propagation = Propagation.REQUIRED)
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao {
    @Override
    public List<Order> findOrderList(int frist,int max) {
        String hql="from Order o left join fetch  o.users u left join fetch o.screenings s left join fetch s.auditorium a left join fetch a.cinema c left join fetch s.shelvesSet sh left join fetch sh.movie m left join fetch m.edition where c.cinId=?1 order by o.addTime desc";
        return em.createQuery(hql,Order.class).setParameter(1,"3").setFirstResult(frist).setMaxResults(max).getResultList();
    }

    @Override
    public int findOrderSize() {
        String hql="from Order o left join fetch o.screenings s left join fetch s.auditorium a left join fetch a.cinema c  where c.cinId=?1";
        return em.createQuery(hql,Order.class).setParameter(1,"3").getResultList().size();
    }

    @Override
    public List<Order> findOrderByCondition(String hql, Map<String, Object> params) {
        Query query=em.createQuery(hql);
        query.setParameter("cinId","3");
        for (String key: params.keySet()) {
            query.setParameter(key,params.get(key));
        }
        return query.getResultList();
    }

//    @Override
//    public List<Order> findOrderList() {
//        String hql="from Order o left join fetch o.screenings s ";
//        return em.createQuery(hql,Order.class).getResultList();
//    }
}
