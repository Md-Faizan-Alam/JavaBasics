package com.training.cg;

public class Product {
	private String prodId;
	private String prodName;
	private String prodDesc;
	private String price;
	
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getProdId() {
		return this.prodId;
	}
	public String getProdName() {
		return this.prodName;
	}
	public String getProdDesc() {
		return this.prodDesc;
	}
	public String getPrice() {
		return this.price;
	}
}
