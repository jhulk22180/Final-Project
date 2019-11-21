package finalpro;
import java.util.ArrayList;
public class Ilist extends IDlist {
	static ArrayList<Ilist> lists = new ArrayList<Ilist>();
	public Ilist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Ilist i0 = new Ilist("Iceland", "Icelandic Krona", "ISK", "Eyrir");
		 Ilist i1 = new Ilist("India", "Indian Rupee", "INR", "Paisa");
		 Ilist i2 = new Ilist("Indonesia", "Indonesian Rupiah", "IDR", "Sen");
		 Ilist i3 = new Ilist("Iran", "Iranian Rial", "IRR", "Dinar");
		 Ilist i4 = new Ilist("Iraq", "Iraqi Dinar", "IQD", "Fils");
		 Ilist i5 = new Ilist("Ireland", "Euro", "EUR", "Cent");
		 Ilist i6 = new Ilist("Isle of Man", "Manx Pound", "IMP", "Penny");
		 Ilist i7 = new Ilist("Israel", "Israeli New Shekel", "ILS", "Agora");
		 Ilist i8 = new Ilist("Italy", "Euro", "EUR", "Cent");

		 
		 lists.add(i0);
		 lists.add(i1);
		 lists.add(i2);
		 lists.add(i3);
		 lists.add(i4);
		 lists.add(i5);
		 lists.add(i6);
		 lists.add(i7);
		 lists.add(i8);
		 for(Ilist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	