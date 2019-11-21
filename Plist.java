package finalpro;
import java.util.ArrayList;
public class Plist extends IDlist {
	static ArrayList<Plist> lists = new ArrayList<Plist>();
	public Plist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Plist p0 = new Plist("Pakistan", "Pakistani Rupee", "PKR", "Paisa");
		 Plist p1 = new Plist("Palau", "United States Dollar", "USD", "Cent");
		 Plist p2 = new Plist("Palestine", "Isaeli New Shekel", "ILS", "Agora");
		 Plist p3 = new Plist("Panama", "Panamanian", "PAB", "Centesimo");
		 Plist p4 = new Plist("Papua New Guinea", "Papua New Guinea Kina", "PGK", "Toea");
		 Plist p5 = new Plist("Paraguay", "Paraguayan Guarani", "PYG", "Centimo");
		 Plist p6 = new Plist("Peru", "Peruvian Sol", "PEN", "Centimo");
		 Plist p7 = new Plist("Philippines", "Philippine Peso", "PHP", "Sentimo");
		 Plist p8 = new Plist("Pitcairn Islands", "New Zealand Dollar", "NZD", "Cent");
		 Plist p9 = new Plist("Poland", "Polish Zloty", "PLN", "Grosz");
		 Plist p10 = new Plist("Portugal", "Euro", "EUR", "Cent");

		 lists.add(p0);
		 lists.add(p1);
		 lists.add(p2);
		 lists.add(p3);
		 lists.add(p4);
		 lists.add(p5);
		 lists.add(p6);
		 lists.add(p7);
		 lists.add(p8);
		 lists.add(p9);
		 lists.add(p10);


		 
		 for(Plist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	