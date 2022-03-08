package com.training.cg;

public class ProductDemo {
	public static void main(String[] args) {
		
		Product prod1 = new Product();
		prod1.setProdId("P001");
		prod1.setProdName("First Product");
		prod1.setProdDesc("This is the first product in our set");
		prod1.setPrice("400");
		
		Product prod2 = new Product();
		prod2.setProdId("P002");
		prod2.setProdName("Second Product");
		prod2.setProdDesc("This is the second product in our set");
		prod2.setPrice("200");
		
		Product prod3 = new Product();
		prod3.setProdId("P003");
		prod3.setProdName("Third Product");
		prod3.setProdDesc("This is the third product in our set");
		prod3.setPrice("300");
		
		Product prod4 = new Product();
		prod4.setProdId("P004");
		prod4.setProdName("Fourth Product");
		prod4.setProdDesc("This is the fourth product in our set");
		prod4.setPrice("500");
		
		Product prod5 = new Product();
		prod5.setProdId("P005");
		prod5.setProdName("Fifth Product");
		prod5.setProdDesc("This is the fifth product in our set");
		prod5.setPrice("100");
		
		int[] price = new int[] {Integer.parseInt(prod1.getPrice()),Integer.parseInt(prod2.getPrice()),Integer.parseInt(prod3.getPrice()),Integer.parseInt(prod4.getPrice()),Integer.parseInt(prod5.getPrice())};
		int costliest = 0;
		int i;
		for(i=0;i<5;i++) {
			if(price[i]>price[costliest]) {
				costliest = i;
			}
		}
		System.out.println("The details of the costliest product is as follows -");
		if(costliest == 0) {
			System.out.println("Product Name : "+prod1.getProdName());
			System.out.println("Product ID : "+prod1.getProdId());
			System.out.println("Product Description : "+prod1.getProdDesc());
			System.out.println("Price : "+prod1.getPrice());
		}
		else if(costliest == 1) {
			System.out.println("Product Name : "+prod2.getProdName());
			System.out.println("Product ID : "+prod2.getProdId());
			System.out.println("Product Description : "+prod2.getProdDesc());
			System.out.println("Price : "+prod2.getPrice());
		}
		else if(costliest == 2) {
			System.out.println("Product Name : "+prod3.getProdName());
			System.out.println("Product ID : "+prod3.getProdId());
			System.out.println("Product Description : "+prod3.getProdDesc());
			System.out.println("Price : "+prod3.getPrice());
		}
		else if(costliest == 3) {
			System.out.println("Product Name : "+prod4.getProdName());
			System.out.println("Product ID : "+prod4.getProdId());
			System.out.println("Product Description : "+prod4.getProdDesc());
			System.out.println("Price : "+prod4.getPrice());
		}
		else if(costliest == 4) {
			System.out.println("Product Name : "+prod5.getProdName());
			System.out.println("Product ID : "+prod5.getProdId());
			System.out.println("Product Description : "+prod5.getProdDesc());
			System.out.println("Price : "+prod5.getPrice());
		}
	}
}
