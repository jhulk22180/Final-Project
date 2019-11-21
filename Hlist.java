package finalpro;
import java.util.ArrayList;
public class Hlist extends IDlist {
	static ArrayList<Hlist> lists = new ArrayList<Hlist>();
	public Hlist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Hlist h0 = new Hlist("Haiti", "Haitian Gourde", "HTG", "Centime");
		 Hlist h1 = new Hlist("Honduras", "Honduran Lempira", "HNL", "Centavo");
		 Hlist h2 = new Hlist("Hong Kong", "Hong Kong Dollar", "HKD", "Cent");
		 Hlist h3 = new Hlist("Hungary", "Hungarian Forint", "HUF", "Filler");

		 lists.add(h0);
		 lists.add(h1);
		 lists.add(h2);
		 lists.add(h3);
		 for(Hlist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	