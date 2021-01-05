
public class TestLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		b1.status();
		
		Member m1 = new Member("Nancy");
		m1.status();
		
		b1.issueBook(m1);
		
		b1.status();
		m1.status();
		
		Member m2 = new Member("Roy");
		b1.issueBook(m2);
		
		Book b2 = new Book("Prophecy");
		b2.issueBook(m1);
		
	}
}
