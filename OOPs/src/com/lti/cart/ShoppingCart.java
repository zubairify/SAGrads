package com.lti.cart;

public class ShoppingCart {
	private int count;
	private double total;
	private Product[] products;
	
	public ShoppingCart() {
		products = new Product[10];
	}
	
	public void addProduct(Product p) {
		if(p == null)
			throw new NullPointerException("Product cannot be null");
		
		products[count] = p;
		count ++;
		total += p.getPrice();
	}
	
	public void showOrder() {
		for(int i=0; i<count; i++)
			System.out.println(products[i].getName());
		
		System.out.println("Total Products: " + count);
		System.out.println("Cart Total: " + total);
	}
}
