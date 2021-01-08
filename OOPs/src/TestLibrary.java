import com.lti.lib.Book;
import com.lti.lib.LibraryException;
import com.lti.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		b1.status();
		
		Member m1 = new Member("Nancy");
		m1.status();
		
		try {
			b1.issueBook(m1);
		} catch (LibraryException e) {
			e.printStackTrace();
		}
		
		b1.status();
		m1.status();
		
		Member m2 = new Member("Roy");
		try {
			b1.issueBook(m2);
		} catch (LibraryException e) {
			System.out.println(e.getMessage());
		}
		
		Book b2 = new Book("Prophecy");
		try {
			b2.issueBook(m1);
		} catch (LibraryException e) {
			System.out.println(e.getMessage());
		}
	}
}
