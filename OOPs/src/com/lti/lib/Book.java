package com.lti.lib;

public class Book {
	private String title;
	private Member member;

	public Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void status() {
		// This method will tell the status of the book
		if (member == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + member.getName());
	}

	public void issueBook(Member m) {
		// Logic to issue a book
		if (this.member != null) {
			System.out.println(title + " is already issued to " + member.getName());
		} else if (m.getBook() != null) {
			System.out.println(m.getName() + " has already issued a book");
		} else {
			this.member = m;
			m.setBook(this);
		}
	}

	public void returnBook(Member m) {
		// Logic to return a book
		this.member = null;
		m.setBook(null);
	}
}
