package com.PlaidShop.Domain;

import java.util.Date;

public class Paint {

	private int id;
	private String name;
	private String author;
	private float price;
	private Date date;
	private Shop shop;
	private static int COUNTER=0;
	
	public Paint (String name, String author, float price, Date date, Shop shop) {
		this.id=COUNTER++;
		this.name=name;
		this.author=author;
		this.price=price;
		this.date=date;
		this.shop=shop;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Shop getShop() {
		return shop;
	}
	
	public void setShop(Shop shop) {
		this.shop=shop;
	}
	
	
}
