package org.movieweb.dao;


import org.domian.utils.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class BaseDao<T> {	
		public void save(T t){
			EntityManager em= HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			try {
				em.persist(t);
				em.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				em.getTransaction().rollback();
			}finally {
//				em.flush();
				em.close();
			}
		}
		
		public void delete( Object t ){
			EntityManager em=HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			try {
				em.remove(t);
				em.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				em.getTransaction().rollback();
			}finally {
				em.close();
			}
		}

	public void remove(Class<T> clazzEntity, int id ) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		try {
			Object obj = em.find( clazzEntity, id );
			em.remove( obj );
			em.getTransaction().commit();
		} catch ( Exception e ) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

		
		public Boolean update(T t){
			EntityManager em=HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			try {
				em.merge(t);
				em.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				em.getTransaction().rollback();
			}finally {
				em.close();
			}
            return null;
        }

		public T findById(Class<T> entityClass,Object id){
			EntityManager em=HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			T entity=null;
			try {
				entity=em.find(entityClass, id);
				em.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				em.getTransaction().rollback();
			}finally {
				em.close();
			}
			return entity;
		}
		
		@SuppressWarnings("unchecked")
		public List<T> findList(Class<T> entityClass){
			String jpql="from "+entityClass.getName();
			EntityManager em=HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			List<T> list=null;
			try {
				list=em.createQuery(jpql).getResultList();
				em.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				em.getTransaction().rollback();
			}finally {
				em.close();
			}
			return list;
		}

//		通过自己写的jpql语句查询单个实体 by何桂贤
		public T findByName( String jpql, String name, Class<?> clazzEntity ) {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			T entity = null;
			try {
				Query query = em.createQuery( jpql, clazzEntity );
				query.setParameter( 1, name );
				entity = ( T )query.getSingleResult();
				em.getTransaction().commit();
			} catch ( Exception e ) {
				e.printStackTrace();
				em.getTransaction().rollback();
			} finally {
				em.close();
			}
			return entity;
		}

//	通过自己写的jpql语句查询List集合 by何桂贤
	public List<T> queryList( String jpql, Class<?> clazzEntity ) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		List<T> list = null;
		try {
			Query query = em.createQuery( jpql, clazzEntity );
			list = ( List<T> )query.getResultList();
			em.getTransaction().commit();
		} catch ( Exception e ) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return list;
	}

//	通过自己写的jpql语句查询单个实体 by何桂贤
	public T queryOne( String jpql, Object param, Class<?> clazzEntity ) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		T entity = null;
		try {
			Query query = em.createQuery( jpql, clazzEntity );
			query.setParameter( 1, param );
			entity = ( T )query.getSingleResult();
			em.getTransaction().commit();
		} catch ( Exception e ) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return entity;
	}

}
