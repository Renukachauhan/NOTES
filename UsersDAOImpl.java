package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UsersDAO;
import com.niit.model.Users;

@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO{
@Autowired
private SessionFactory sessionFactory;

	
	public void addUsers(Users users) {
		sessionFactory.openSession().saveOrUpdate(users);		
	}

	
	public void deleteUsers(Users users) {
		sessionFactory.openSession().delete(users);
		
	}


	public Users getUsersById(int userid) {
		return (Users) sessionFactory.openSession().get(Users.class, userid);
	}


	public void editUsers(Users users) {
		sessionFactory.openSession().update(users);
		
	}

	
	public List getAllUsers() {
	return	sessionFactory.openSession().createQuery("from Users").list();
	}

}
