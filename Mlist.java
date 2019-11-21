package finalpro;
import java.util.ArrayList;
public class Mlist extends IDlist {
	static ArrayList<Mlist> lists = new ArrayList<Mlist>();
	public Mlist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Mlist m0 = new Mlist("Macau", "Macanese Pataca", "MOP", "Avo");
		 Mlist m1 = new Mlist("Madagascar", "Malagasy Ariary", "MGA", "Iraimbilanja");
		 Mlist m2 = new Mlist("Malawi", "Malawian Kwacha", "MWK", "Tambala");
		 Mlist m3 = new Mlist("Malaysia", "Malaysian Ringgit", "MYR", "Sen");
		 Mlist m4 = new Mlist("Maldives", "Maldivian Rufiyaa", "MVR", "Laari");
		 Mlist m5 = new Mlist("Mali", "West African CFA Franc", "XOF", "Centime");
		 Mlist m6 = new Mlist("Malta", "Euro", "EUR", "Cent");
		 Mlist m7 = new Mlist("Marshall Islands", "United States Dollar", "USD", "Cent");
		 Mlist m8 = new Mlist("Mauritania", "Mauritanian Ouguiya", "MRU", "Khoums");
		 Mlist m9 = new Mlist("Mauritius", "Mauritian Rupee", "MUR", "Cent");
		 Mlist m10 = new Mlist("Mexico", "Mexican Peso", "MXN", "Centavo");
		 Mlist m11 = new Mlist("Micronesia", "United States Dollar", "USD", "Cent");
		 Mlist m12 = new Mlist("Moldova", "Moldovann Leu", "MDL", "Ban");
		 Mlist m13 = new Mlist("Monaco", "Euro", "EUR", "Cent");
		 Mlist m14 = new Mlist("Mongolia", "Mongolian Togrog", "MNT", "Mongo");
		 Mlist m15 = new Mlist("Montenegro", "Euro", "EUR", "Cent");
		 Mlist m16 = new Mlist("Montserrat", "Eastern Caribbean Dollar", "XCD", "Cent");
		 Mlist m17 = new Mlist("Morocco", "Moroccan Dirham", "MAD", "Centime");
		 Mlist m18 = new Mlist("Mozambique", "Mozambican Metical", "MZN", "Centavo");
		 Mlist m19 = new Mlist("Myanmar", "Burmese Kyat", "MMK", "Pya");

		 lists.add(m0);
		 lists.add(m1);
		 lists.add(m2);
		 lists.add(m3);
		 lists.add(m4);
		 lists.add(m5);
		 lists.add(m6);
		 lists.add(m7);
		 lists.add(m8);
		 lists.add(m9);
		 lists.add(m10);
		 lists.add(m11);
		 lists.add(m12);
		 lists.add(m13);
		 lists.add(m14);
		 lists.add(m15);
		 lists.add(m16);
		 lists.add(m17);
		 lists.add(m18);
		 lists.add(m19);

		 
		 for(Mlist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	