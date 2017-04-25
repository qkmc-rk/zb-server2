package org.cat.zb.dao.impl;

import java.util.List;

import org.cat.zb.dao.UserDao;
import org.cat.zb.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao{

	/*
	 * sessionFactory
	 * */
	@Autowired
	private SessionFactory sessionFactory;
	
	/*
	 * setter and getter
	 * */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/*
	 * method: getSession
	 * @ return hibernate session
	 * */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	/*
	 * @return list of users
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		String hql = "FROM User";
		
		return getSession().createQuery(hql).list();
	}
}
