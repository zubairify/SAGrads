import static java.lang.System.out;

public class HelloImpl implements Hello {

	@Override
	public String sayHello() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		Hello hi = new HelloImpl();
		System.out.println(hi.sayHello());
		
		// Lambda expression
		Hello h2 = () -> "Hello Again!";
		out.println(h2.sayHello());
		
		Hello h3 = () -> "Hello from the other side";
		out.println(h3.sayHello());
		out.println(h3.greet());
		
		Hello.applause();
	}
}
