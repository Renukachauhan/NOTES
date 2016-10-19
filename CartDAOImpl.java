package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartDAO;
import com.niit.model.Cart;
@Repository
@Transactional
public class CartDAOImpl implements CartDAO {
@Autowired
private SessionFactory sessionFactory;
	public void addCart(Cart cart) {
		sessionFactory.openSession().save(cart);
		
	}

	public void deleteCart(Cart cart) {
		sessionFactory.openSession().delete(cart);
		
	}

	public Cart getCartById(int cartId) {
		return (Cart) sessionFactory.openSession().get(Cart.class, cartId);
	}

	public void editCart(Cart cart) {
		sessionFactory.openSession().update(cart);
		
	}

	public List getAllCart() {
	return	sessionFactory.openSession().createQuery("from Cart").list();
	}

}
