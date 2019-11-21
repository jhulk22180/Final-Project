package finalpro;
import java.util.ArrayList;
public class Nlist extends IDlist {
	static ArrayList<Nlist> lists = new ArrayList<Nlist>();
	public Nlist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Nlist n0 = new Nlist("Namibia", "Namibian Dollar", "NAD", "Cent");
		 Nlist n1 = new Nlist("Nauru", "Australian Dollar", "AUD", "Cent");
		 Nlist n2 = new Nlist("Nepal", "Nepalese Rupee", "NPR", "Paisa");
		 Nlist n3 = new Nlist("Netherlands", "Euro", "EUR", "Cent");
		 Nlist n4 = new Nlist("New Calendonia", "CFP Franc", "XPF", "Centime");
		 Nlist n5 = new Nlist("New Zealand", "New Zealand Dollar", "NZD", "Cent");
		 Nlist n6 = new Nlist("Nicaragua", "Nicaraguan Cordoba", "NIO", "Centavo");
		 Nlist n7 = new Nlist("Niger", "West African CFA Franc", "XOF", "Centime");
		 Nlist n8 = new Nlist("Nigeria", "Nigerian Naira", "NGN", "Kobo");
		 Nlist n9 = new Nlist("Niue", "New Zealand Dollar", "NZD", "Cent");
		 Nlist n10 = new Nlist("North Macedonia", "Macedonian Denar", "MKD", "Deni");
		 Nlist n11 = new Nlist("Northern Cyprus", "Turkish Lira", "TRY", "Kurus");
		 Nlist n12 = new Nlist("Norway", "Norwaegian Krone", "NOK", "Ore");


		 lists.add(n0);
		 lists.add(n1);
		 lists.add(n2);
		 lists.add(n3);
		 lists.add(n4);
		 lists.add(n5);
		 lists.add(n6);
		 lists.add(n7);
		 lists.add(n8);
		 lists.add(n9);
		 lists.add(n10);
		 lists.add(n11);
		 lists.add(n12);

		 
		 
		 for(Nlist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	