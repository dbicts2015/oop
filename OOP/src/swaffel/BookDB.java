package swaffel;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookDB {

	private final List<Book> books = new ArrayList<Book>();

	public void addBook(String title, String author, BigDecimal price, boolean paperback) {
		this.addBook(new Book(title, author, price, paperback));
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void sort(String type) throws NoSuchFieldException, SecurityException {
		Class<Book> bookclass = Book.class;
		
		final Field field = bookclass.getDeclaredField(type);
		field.setAccessible(true);
		
		Collections.sort(books, new Comparator<Book>() {
			
			@Override
			public int compare(Book o1, Book o2) {
				try {
					return field.get(o1).toString().compareTo(field.get(o2).toString());
				} catch (Exception ex) {
					throw new IllegalArgumentException("No such field " + type);
				}
			}
			
		});
	}

	/**
	 * 
	 * @return
	 */
	public String listBooks() {
		StringBuilder builder = new StringBuilder();
		for (Book book : books) {
			builder.append("Title:\t").append(book.getTitle()).append("\n");
			builder.append("Author:\t").append(book.getAuthor()).append("\n");
			builder.append("Price:\t").append(book.getPrice()).append("\n");
			builder.append("Paperback:").append(book.isPaperback() ? "y" : "n").append("\n");
			builder.append("\n");
		}
		return builder.toString();
	}

}
