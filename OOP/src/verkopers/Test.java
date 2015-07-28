package verkopers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner scanner = new Scanner(new FileReader("lol"))) {
			Set<Lol> lol = new TreeSet<>();
			while (scanner.hasNext()) {
				String[] l = scanner.nextLine().split(" ");
				lol.add(new Lol(l[0], l[1]));
			}
			
			
			for(Lol l : lol) {
				if (l.b.equals("Godarville")) break;
				System.out.printf("<option value=\"%s\">%s</option>%n", l.a, l.b);
			}
		}
	}

	private static class Lol implements Comparable<Lol>{
		private String a;
		private String b;
		public Lol(String a, String b) {
			this.a = a;
			this.b=b;
		}
		@Override
		public int compareTo(Lol o) {
			return b.compareTo(o.b);
		}
	}

}
