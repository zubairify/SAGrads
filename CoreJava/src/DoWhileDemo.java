
public class DoWhileDemo {

	public static void main(String[] args) {
		int count = 1;
		
		do {
			System.out.println(count ++); // Print and increment count
		} while(count <= 10);
		
		int num = 0;
		System.out.println("Print all odd numbers from 1 to 10");
		do {
			num ++;
			if(num % 2 == 0)
				continue;
			System.out.println(num);
		} while(num <= 10);
		
	}
}
