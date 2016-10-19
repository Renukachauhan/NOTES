package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UsersDAO;
import com.niit.model.Users;
import com.niit.service.UsersService;

@Service
@Transactional 
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO usersDAO;
	  
	public void addUsers(Users users) {
		usersDAO.addUsers(users);		
	}

	  
	public void deleteUsers(Users users) {
		usersDAO.deleteUsers(users);		
	}

	  
	public Users getUsersById(int userid) {
	return	usersDAO.getUsersById(userid);	}

	  
	public void editUsers(Users users) {
		usersDAO.editUsers(users);		
	}

	  
	public List getAllUsers() {
		return usersDAO.getAllUsers();
	}

}
