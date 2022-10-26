package com.simplilearn.medicare.view;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.simplilearn.medicare.entity.CartItem;
import com.simplilearn.medicare.entity.User;

public class CartView {

	private int cartViewId;

	private List<CartViewItem> cartItems;
	private double totalAmount;
	public CartView(int cartViewId, List<CartViewItem> cartItems, double totalAmount) {
		super();
		this.cartViewId = cartViewId;
		this.cartItems = cartItems;
		this.totalAmount = totalAmount;
	}
	public int getCartViewId() {
		return cartViewId;
	}
	public void setCartViewId(int cartViewId) {
		this.cartViewId = cartViewId;
	}
	public List<CartViewItem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartViewItem> cartItems) {
		this.cartItems = cartItems;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
