
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
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if(p.name.equals(this.name) && p.age == this.age)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// Instantiating Person class
		Person p1 = new Person("Polo", 21);
		System.out.println(p1.hashCode());
		System.out.println(p1);
		
		Person p2 = new Person("Lili", 21);
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
	}
}
