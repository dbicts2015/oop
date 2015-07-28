package swaffel;

import java.math.BigDecimal;

public class Book {

	private final String title;
	private final String author;
	private final BigDecimal price;
	private final boolean paperback;

	public Book(String title, String author, BigDecimal price, boolean paperback) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.paperback = paperback;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public boolean isPaperback() {
		return paperback;
	}

}