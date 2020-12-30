
public class IfElseDemo {

	public static void main(String[] args) {
		
		int num = 5;
		
		if(num % 2 == 0)
			System.out.println(num + " is Even No.");
		else
			System.out.println(num + " is Odd No.");
		
		System.out.println(num % 2 == 0 ? "Even" : "Odd");
		
		int n1 = 10;
		int n2 = 15;
		
		if(n1 > n2)
			System.out.println(n1 + " is greater");
		else if(n2 > n1)
			System.out.println(n2 + " is greater");
		else
			System.out.println("Both are equal");
		
		System.out.println(n1 > n2 ? n1 : (n2 > n1 ? n2 : "Equal"));
	}
}
