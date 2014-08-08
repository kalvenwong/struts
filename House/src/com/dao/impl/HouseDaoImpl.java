package com.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.dao.HouseDao;
import com.entity.House;
import com.util.HibernateSessionFactory;

public class HouseDaoImpl implements HouseDao {

	public List<House> findAllHouse() throws Exception{
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
//		return session.createCriteria(House.class).list();
		String hql="from House";
		List<House> houseList=session.createQuery(hql).list();
		return houseList;
	}

	public List<House> findAllHouseByPage(int pageNo, int pageSize)
			throws Exception {
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		List<House> result = null;
		String hql="from House";
			Query query = session.createQuery(hql);
			query.setFirstResult((pageNo - 1) * pageSize);
			query.setMaxResults(pageSize);
			result = query.list();
			return result;
	}

	public List<House> findAllHouseByPage(int pageNo, int pageSize, String title)
			throws Exception {
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		List<House> result = null;
		String hql="from House where title like:title";
			Query query = session.createQuery(hql);
			query.setString("title", "%"+title+"%");
			query.setFirstResult((pageNo - 1) * pageSize);
			query.setMaxResults(pageSize);
			result = query.list();
			return result;
	}

	public void deleteHouse(Integer id) throws Exception {
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		String hql="delete House h where h.id=?";
		Query query=session.createQuery(hql);
		query.setInteger(0,id);
		query.executeUpdate();
	}

}
