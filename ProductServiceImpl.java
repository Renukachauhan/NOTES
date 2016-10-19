package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;
import com.niit.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	@Override
	public void addProduct(Product product) {
		System.out.println("in impl");
		productDAO.addProduct(product);		
	}

	@Override
	public void deleteProduct(Product product) {
		productDAO.deleteProduct(product);		
	}

	@Override
	public Product getProductById(int pid) {
		return productDAO.getProductById(pid);
	}

	@Override
	public void editProduct(Product product) {
		productDAO.editProduct(product);		
	}

	@Override
	public List<Product> getAllProduct() {
		return productDAO.getAllProduct();
	}

}
