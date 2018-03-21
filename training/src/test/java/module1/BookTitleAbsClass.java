package module1;

import java.util.*;

public class BookTitleAbsClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		Book book = new MyBook(title, author, price);
		book.display();
	}
}

abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}

class MyBook extends Book {
	int price = 0;

	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);

	}
}

/*
 * The following input from stdin is handled by the locked stub code in your
 * editor:
 * 
 * The Alchemist Paulo Coelho 248
 */