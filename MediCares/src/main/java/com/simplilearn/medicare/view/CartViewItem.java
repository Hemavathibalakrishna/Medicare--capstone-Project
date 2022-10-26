package com.simplilearn.medicare.view;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.simplilearn.medicare.entity.Product;

public class CartViewItem {

	private int cartItemId;
	private Product product;
	private int productId;
	private String productName;
	private String imageUrl;
	private int price;
	private int quantity;
	private double subTotal;
	
	public CartViewItem() {
		// TODO Auto-generated constructor stub
	}
	
	public CartViewItem(int cartItemId, Product product, int quantity, double subTotal) {
		this.cartItemId=cartItemId;
		this.product=product;
		this.quantity=quantity;
		this.subTotal=subTotal;
	}
	public int getCartViewItemId() {
		return cartItemId;
	}
	public void setCartViewItemId(int cartViewItemId) {
		this.cartItemId = cartViewItemId;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
