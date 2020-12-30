
public class SortArrayDemo {

	public static void main(String[] args) {
		int[] sar = {5,3,1,2,4};
		int temp = 0;
		
		// Write logic to sort the array
		for (int i = 0; i < sar.length; i++) {
			for (int j = i+1; j < sar.length; j++) {
				if(sar[i] > sar[j]) {
					temp = sar[i];
					sar[i] = sar[j];
					sar[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < sar.length; i++) {
			System.out.println(sar[i]);
		}
	}
}
