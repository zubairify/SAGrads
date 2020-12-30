
public class StringPatterns {

	public static void main(String[] args) {
		
		String name = "Zubair";
		String mobile = "9820108880";
		String credit = "1020304050607080";
		String email = "Zubair2020@1999.com";
		
		// Rule for name is min 4 chars and first alphabet in caps
		// Rule for mobile is 10 digits
		
		String namePattern = "[A-Z]{1}[a-z]{3,}";
		String mobilePattern = "[0-9]{10}";
		String creditPattern = "[0-9]{16}";
		String emailPattern = "[A-Za-z0-9]{4,}+@[a-z0-9]{3,}\\.[a-z]{2,3}";
		
		System.out.println(name.matches(namePattern));
		System.out.println(mobile.matches(mobilePattern));
		System.out.println(credit.matches(creditPattern));
		System.out.println(email.matches(emailPattern));
	}
}
