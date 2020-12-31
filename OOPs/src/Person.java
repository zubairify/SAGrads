
public class Person {
	// Declaring private attributes in a class
	private String name;
	private int age;

	// Default constructor
	public Person() {
		// Calling another constructor on the current object, with matching signature
		this("Anonymous", -1);
	}
	
	// Defining parameterised constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Defining public methods 	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args) {
		// Instantiating Person class
		Person p1 = new Person("Polo", 21);
		// Calling methods on person object
		p1.print();
		
		Person p2 = new Person();
		p2.print();
		
		Person p3 = new Person("Mili", 19);
		p3.print();
	}
}
