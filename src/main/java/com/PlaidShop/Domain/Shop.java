package com.PlaidShop.Domain;

public class Shop {

	private int id;
	private String name;
	private int maxPaints;
	private static int COUNTER=0;
	
	
	public Shop(String name, int maxPaints) {
		this.id=COUNTER++;
		this.name=name;
		this.maxPaints=maxPaints;
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

	public int getMaxPaints() {
		return maxPaints;
	}

	public void setMaxPaints(int maxPaints) {
		this.maxPaints = maxPaints;
	}
	
	
}
