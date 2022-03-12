package com.training.cg.product;

public class Product {
	private String prodId;
	private String prodName;
	private String prodDesc;
	private int price;
	
	// Setters
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//Getters
	public String getProdId() {
		return this.prodId;
	}
	public String getProdName() {
		return this.prodName;
	}
	public String getProdDesc() {
		return this.prodDesc;
	}
	public int getPrice() {
		return this.price;
	}
	
	//Printing Details
	public void getInfo() {
		System.out.println("Product Name : "+this.getProdName());
		System.out.println("Product ID : "+this.getProdId());
		System.out.println("Product Description : "+this.getProdDesc());
		System.out.println("Price : "+this.getPrice());
	}
	
}
