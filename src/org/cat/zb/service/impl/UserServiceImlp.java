package org.cat.zb.service.impl;

import java.util.List;

import org.cat.zb.dao.UserDao;
import org.cat.zb.entities.User;
import org.cat.zb.service.UserService;

public class UserServiceImlp implements UserService{
	
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/*
	 * @return all users in list
	 * 
	 * */
	@Override
	public List<User> getAllUsers() {
		return userDao.getAll();
	}

}
