
public class EmailValidator {
	
	public static void main(String[] args) {
		String email = "zuba@mai.co";
		
		// Validate the email with following rules
		// 1- Only 1 @ and 1 . is allowed
		// 2- Min 4 chars before @
		// 3- Min 3 chars between @ and .
		// 4- Min 2 chars after .
		
		int ioat = email.indexOf('@');
		int idot = email.indexOf('.');
		
		if(ioat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && ioat > 3
				&& idot > ioat + 3 && email.length() > idot + 2)
			
			System.out.println("Valid email");
		else
			System.out.println("Invalid email");
	}

}
