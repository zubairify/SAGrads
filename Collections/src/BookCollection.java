import java.util.ArrayList;

public class BookCollection {
	private ArrayList<Book> books;
	
	public BookCollection() {
		books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void printBooks() {
		for (Book book : books) 
			System.out.println(book);
	}
}
