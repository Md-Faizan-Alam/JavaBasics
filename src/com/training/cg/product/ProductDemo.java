package com.training.cg.product;

public class ProductDemo {
	public static void main(String[] args) {
		
		Product prod1 = new Product();
		prod1.setProdId("P001");
		prod1.setProdName("First Product");
		prod1.setProdDesc("This is the first product in our set");
		prod1.setPrice(400);
		
		Product prod2 = new Product();
		prod2.setProdId("P002");
		prod2.setProdName("Second Product");
		prod2.setProdDesc("This is the second product in our set");
		prod2.setPrice(200);
		
		Product prod3 = new Product();
		prod3.setProdId("P003");
		prod3.setProdName("Third Product");
		prod3.setProdDesc("This is the third product in our set");
		prod3.setPrice(300);
		
		Product prod4 = new Product();
		prod4.setProdId("P004");
		prod4.setProdName("Fourth Product");
		prod4.setProdDesc("This is the fourth product in our set");
		prod4.setPrice(500);
		
		Product prod5 = new Product();
		prod5.setProdId("P005");
		prod5.setProdName("Fifth Product");
		prod5.setProdDesc("This is the fifth product in our set");
		prod5.setPrice(100);
		
		Product[] prodArr = new Product[] {prod1,prod2,prod3,prod4,prod5};
		
		
		int costliest = 0;
		for(int i=0;i<5;i++) {
			if(prodArr[i].getPrice()>prodArr[costliest].getPrice()) {
				costliest = i;
			}
		}
		
		System.out.println("The details of the costliest product is as follows -");
		prodArr[costliest].getInfo();

	}
}
