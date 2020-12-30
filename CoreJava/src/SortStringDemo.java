
public class SortStringDemo {

	public static void main(String[] args) {
		String[] star = {"Banana","Cherry","Kiwi","Apple","Orange"};
		
		// Write logic to sort this array
		String temp = "";
		for (int i = 0; i < star.length; i++) {
			for (int j = i+1; j < star.length; j++) {
				if(star[i].compareTo(star[j]) > 0) {
					temp = star[i];
					star[i] = star[j];
					star[j] = temp;
				}
			}
		}
		
		for (String str : star) 
			System.out.println(str);
	}
}
