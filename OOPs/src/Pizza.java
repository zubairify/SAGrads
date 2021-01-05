
public class Pizza {
	private String size;
	private int toppings;
	private double price;
	
	public Pizza() {
	}

	public Pizza(String size, int toppings) {
		this.size = size;
		this.toppings = toppings;
		
		switch(size.toLowerCase()) {
			case "small" : price = 100;	break;
			case "medium" : price = 200; break;
			default : price = 300;
		}
		price += (toppings * 50);
	}
	
	public void order() {
		System.out.println("Size: " + size);
		System.out.println("Toppings: " + toppings);
		System.out.println("Price: " + price);
	}
}
