package swaffel;

import java.math.BigDecimal;

public class Main0 {
	public static void main(String[] args) throws Exception {
		BookDB db = new BookDB();
		db.addBook(new Book("C# for experienced programmers", "Deitel",
				new BigDecimal("55"), false));
		db.addBook(new Book("C# How to program", "Deitel",
				new BigDecimal("90"), false));
		db.addBook(new Book("C++ from the beginning", "Skansholm",
				new BigDecimal(30), true));
		db.addBook("Toepassing van UML", "Stevens", new BigDecimal(
				"29.5"), true);
		db.addBook("Professional C# 2005", "Nagel, Evjen e.o.",
				new BigDecimal("45.9"), false);

		System.out.println("\nall books:");
		System.out.println(db.listBooks());
		
		System.out.println("SORTEER OP AUTHOR");
		db.sort("author");
		System.out.println(db.listBooks());
		
		System.out.println("SORTEER OP PRICE");
		db.sort("price");
		System.out.println(db.listBooks());
	}
}
/*  OUTPUT:
 
all books:


Title:	C# for experienced programmers
Author:	Deitel
Price:	55
Paperback:n


Title:	C# How to program
Author:	Deitel
Price:	90
Paperback:n


Title:	C++ from the beginning
Author:	Skansholm
Price:	30
Paperback:y


Title:	Toepassing van UML
Author:	Stevens
Price:	29.5
Paperback:y


Title:	Professional C# 2005
Author:	Nagel, Evjen e.o.
Price:	45.9
Paperback:n

*/
