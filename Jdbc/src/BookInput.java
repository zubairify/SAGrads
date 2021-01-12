import java.util.Scanner;

public class BookInput {

	public static void main(String[] args) {
		// Scanner is used to accept input from the console
		Scanner console = new Scanner(System.in);
		System.out.println("1-Add Book");
		System.out.println("2-Show Books");
		System.out.println("3-Exit");
		System.out.print("Select Choice: ");
		int choice = console.nextInt();
		switch(choice) {
		case 1 :
			System.out.print("Enter ISBN: ");
			int isbn = console.nextInt();
		
			System.out.print("Enter Title: ");
			String title = console.nextLine();
		
			System.out.print("Enter Price: ");
			double price = console.nextDouble();
		
			// Encapsulating book details in book object
			Book book = new Book();
			book.setIsbn(isbn);
			book.setTitle(title);
			book.setPrice(price);
		
			// Sending book object to a class to store it into database
			BookDao.saveBook(book); break;
		case 2 : BookDao.printBooks(); break;
		case 3 : System.exit(0);
		default: System.out.println("Wrong option");
		}
	}
}
