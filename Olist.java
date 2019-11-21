package finalpro;
import java.util.ArrayList;
public class Olist extends IDlist {
	static ArrayList<Olist> lists = new ArrayList<Olist>();
	public Olist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Olist O0 = new Olist("Oman", "Omani Rial", "OMR", "Baisa");

		 lists.add(O0);
		 
		 for(Olist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	