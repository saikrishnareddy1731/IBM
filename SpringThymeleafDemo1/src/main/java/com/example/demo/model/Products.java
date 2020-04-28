package com.example.demo.model;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String description;
	 private int price;
	 private String imageUrl;
	public Products(String description, int price, String imageUrl) {
		super();
		this.description = description;
		this.price = price;
		this.imageUrl = imageUrl;
	}
	public Products() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", description=" + description + ", price=" + price + ", imageUrl=" + imageUrl
				+ "]";
	}
	 
	 
}
