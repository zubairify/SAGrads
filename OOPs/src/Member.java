
public class Member {
	private String name;
	private Book book;
	
	public Member() {
	}

	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	public void status() {
		// This method will tell the status of the member
		if(book == null)
			System.out.println(name + " has not issued any book");
		else
			System.out.println(name + " has issued " + book.getTitle());
	}
}
