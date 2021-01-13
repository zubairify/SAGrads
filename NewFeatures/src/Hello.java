
@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default String greet() {
		return "Good day!";
	}
	
	static void applause() {
		System.out.println("Clap Clap");
	}
}
