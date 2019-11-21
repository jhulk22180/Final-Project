package finalpro;
import java.util.ArrayList;
public class Jlist extends IDlist {
	static ArrayList<Jlist> lists = new ArrayList<Jlist>();
	public Jlist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Jlist j0 = new Jlist("Jamaica", "Jamaican Dollar", "JMD", "Cent");
		 Jlist j1 = new Jlist("Japan", "Japanese Yen", "JPY", "Sen");
		 Jlist j2 = new Jlist("Jersey", "Jersey Pound", "JEP", "Penny");
		 Jlist j3 = new Jlist("Jordan", "Jordanian Dinar", "JOD", "Piastre");

		 lists.add(j0);
		 lists.add(j1);
		 lists.add(j2);
		 lists.add(j3);
		 
		 for(Jlist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	