
public class PalindromeDemo {

	public static void main(String[] args) {
		
		String str = "madaam";
		
		int i=0;
		int j=str.length() -1;
		boolean flag = true;
		
		for(;i<j; i++, j--) {
			if(str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "Palindrome" : "Not Palindrome");
	}
}
