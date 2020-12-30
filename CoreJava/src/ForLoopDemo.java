
public class ForLoopDemo {

	public static void main(String[] args) {
		
		for(int c=1; c <= 10; c++)
			System.out.println(c);
		
		System.out.println("For loop to print all even numbers between 1 to 10");
		for(int c=1; c <= 10; c++) {
			if(c % 2 == 0)
				System.out.println(c);
		}
			
		System.out.println("Check if the number is Prime or not");
		int num = 7;
		// Write here your code
		boolean flag = true;
		for(int c=2; c<num; c++) {
			if(num % c == 0) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "Prime" : "Not Prime"); 
	}
}
