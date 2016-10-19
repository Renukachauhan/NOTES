package com.niit.model;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class UsersOrder implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@OneToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	
	@OneToOne 
	@JoinColumn(name="customer")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name="billsId")
	private BillingAddress billsaddress;
	
	@OneToOne
	@JoinColumn(name="shipId")
	private ShippingAddress shipaddress;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BillingAddress getBillsaddress() {
		return billsaddress;
	}

	public void setBillsaddress(BillingAddress billsaddress) {
		this.billsaddress = billsaddress;
	}

	public ShippingAddress getShipaddress() {
		return shipaddress;
	}

	public void setShipaddress(ShippingAddress shipaddress) {
		this.shipaddress = shipaddress;
	}
}
