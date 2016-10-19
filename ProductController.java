/*package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.Product;
import com.niit.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/product")
	public String product(Model model){
		return "product";
	}
	
	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
	public String insertNewProduct(@ModelAttribute("addProducts") Product product, Model model) {
		System.out.println("in controller");

		productService.addProduct(product);
		return "product";
	}
}
*/