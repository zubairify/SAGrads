import java.util.Scanner;

public class BookInput {

	public static void main(String[] args) {
		// Scanner is used to accept input from the console
		BookCollection bc = new BookCollection();
		Scanner console = new Scanner(System.in);

		while (true) {
			System.out.println("1-Add Book");
			System.out.println("2-Show Books");
			System.out.println("3-Exit");
			System.out.print("Select Choice: ");
			int choice = console.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter ISBN: ");
				int isbn = console.nextInt();

				System.out.print("Enter Title: ");
				String title = console.next();

				System.out.print("Enter Price: ");
				double price = console.nextDouble();

				// Encapsulating book details in book object
				Book book = new Book();
				book.setIsbn(isbn);
				book.setTitle(title);
				book.setPrice(price);

				// Sending book object to a class to store it into database
				bc.addBook(book); break;
			case 2: bc.printBooks(); break;
			case 3: System.exit(0);
			default: System.out.println("Wrong option");
			}
		}
	}
}
