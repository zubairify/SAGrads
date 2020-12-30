
public class CmdLineDemo {

	public static void main(String[] args) {
		
		for (String param : args) {
			System.out.println(param);
		}
		int len = args.length;
		int sum = 0;
		double avg = 0.0;
		for (String param : args) {
			// Extracting int value out of String object
			int num = Integer.parseInt(param);
			sum += num;
		}
		avg = sum / len;
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + avg);
	}
}
