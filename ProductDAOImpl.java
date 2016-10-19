package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addProduct(Product product) {
		sessionFactory.openSession().saveOrUpdate(product);;		
	}

	@Override
	public void deleteProduct(Product product) {
		sessionFactory.openSession().delete(product);		
	}

	@Override
	public Product getProductById(int pid) {
	return	(Product) sessionFactory.openSession().get(Product.class, pid);
	}

	@Override
	public void editProduct(Product product) {
		sessionFactory.openSession().update(product);		
	}

	@SuppressWarnings("unchecked")
	@Override 
	
	public List<Product> getAllProduct() {
		return sessionFactory.openSession().createQuery("from Product").list();
		}

}
