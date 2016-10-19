package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartDAO;
import com.niit.model.Cart;
import com.niit.service.CartService;

@Service
@Transactional
public class CartServiceImpl implements  CartService{

	
	@Autowired
	private CartDAO cartDAO;

	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		cartDAO.addCart(cart);
		
	}

	public void deleteCart(Cart cart) {
		// TODO Auto-generated method stub
		cartDAO.deleteCart(cart);
	}

	public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
		return cartDAO.getCartById(cartId);
	}

	public void editCart(Cart cart) {
		// TODO Auto-generated method stub
		cartDAO.editCart(cart);
	}

	public List getAllCart() {
		// TODO Auto-generated method stub
		return cartDAO.getAllCart();
	}
}
