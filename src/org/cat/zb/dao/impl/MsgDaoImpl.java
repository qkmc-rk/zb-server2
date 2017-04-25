package org.cat.zb.dao.impl;

import java.util.List;

import org.cat.zb.dao.MsgDao;
import org.cat.zb.entities.Msg;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MsgDaoImpl implements MsgDao{

	
	/*
	 * sessionFactory spring gives
	 * */
	@Autowired
	private SessionFactory sessionFactory ;
	
	/*
	 * method: getSession()
	 * */
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Msg> getAllMsg() {
		String hql = "from Msg";
		return getSession().createQuery(hql).list();
	}
	
	/*
	 * sessionFactory setter and setter
	 * 
	 * */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void deleteMsgByUserId(int userId) {
		String hql = "delete from Msg where msg_id = ?";
		getSession().createQuery(hql).setInteger(0, userId).executeUpdate();
	}

	@Override
	public void addMsg(Msg msg) {
		getSession().save(msg);
	}
}
