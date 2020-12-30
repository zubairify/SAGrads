
public class WhileLoopDemo {

	public static void main(String[] args) {
		int count = 1;
		
		while(count <= 10) {
			System.out.println(count);
			count ++;	// incrementing count
		}
		
		System.out.println("Printing all even number from 1 to 10");
		int num = 1;
		while(num <= 10) {
			if(num % 2 == 0)
				System.out.println(num);
			num ++;	// Post-increment
		}
		
		count = 1;	// Resetting count to one
		System.out.println("Print and end the loop once the number is divisible by 5");
		while(count <= 10) {
			if(count % 5 == 0) {
				System.out.println(count);
				break;
			}
			++ count;	// Pre-increment
		}
	}
}
