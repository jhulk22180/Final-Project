package finalpro;
import java.util.ArrayList;
public class Llist extends IDlist {
	static ArrayList<Llist> lists = new ArrayList<Llist>();
	public Llist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Llist l0 = new Llist("Laos", "Lao Kip", "LAK", "Att");
		 Llist l1 = new Llist("Latvia", "Euro", "EUR", "Cent");
		 Llist l2 = new Llist("Lebanon", "Lebanonese Pound", "LBP", "Piastre");
		 Llist l3 = new Llist("Lesotho", "Lesotho Loti", "LSL", "Sente");
		 Llist l4 = new Llist("Liberia", "Liberian Dollar", "LRD", "Cent");
		 Llist l5 = new Llist("Libya", "Libyan Dinar", "LYD", "Dirham");
		 Llist l6 = new Llist("Liechtenstein", "Swiss France", "CHF", "Rappen");
		 Llist l7 = new Llist("Lithuania", "Euro", "EUR", "Cent");
		 Llist l8 = new Llist("Luxembourg", "Euro", "EUR", "Cent");

		 lists.add(l0);
		 lists.add(l1);
		 lists.add(l2);
		 lists.add(l3);
		 lists.add(l4);
		 lists.add(l5);
		 lists.add(l6);
		 lists.add(l7);
		 lists.add(l8);
		 for(Llist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	