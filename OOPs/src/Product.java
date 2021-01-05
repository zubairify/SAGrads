
public class Product {
	private String name;
	private double price;
	
	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void specs() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
