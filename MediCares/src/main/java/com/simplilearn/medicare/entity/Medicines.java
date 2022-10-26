package com.simplilearn.medicare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicines {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productId")
	private int productId;
	@Column(name="productName")
	private String productName;
	@Column(name="iamgeUrl")
	private String imageUrl;
	@Column(name="price")
	private int price;
	public Medicines() {
		// TODO Auto-generated constructor stub
	}
	public Medicines(String productName, String imageUrl, int price) {
		super();
		this.productName = productName;
		this.imageUrl = imageUrl;
		this.price = price;
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
