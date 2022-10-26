package com.simplilearn.medicare.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pId")
	private int pId;
	@Column(name="productName")
	private String productName;
	@Column(name="iamgeUrl")
	private String imageUrl;
	@Column(name="price")
	private int price;
	
public Product() {
	// TODO Auto-generated constructor stub
}

public Product(String productName, String imageUrl, int price) {
	super();
	this.productName = productName;
	this.imageUrl = imageUrl;
	this.price = price;
}

public int getPId() {
	return pId;
}

public void setPId(int pId) {
	this.pId = pId;
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
