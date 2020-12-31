
public class Citizen {
	private String name;
	private String country;
	
	public Citizen() {
	}

	public Citizen(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	public void display() {
		System.out.println("Name: " + name + "\tCountry: " + country);
	}
	
	public static void main(String[] args) {
		Citizen c1 = new Citizen("Zubair", "India");
		c1.display();
		
	}
}
