package finalpro;
import java.util.ArrayList;
public class Klist extends IDlist {
	static ArrayList<Klist> lists = new ArrayList<Klist>();
	public Klist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Klist k0 = new Klist("Kazakhstan", "Kazakhstani Tenge", "KZT", "Tiin");
		 Klist k1 = new Klist("Kenya", "Kenyan Shilling", "KES", "Cent");
		 Klist k2 = new Klist("Kiribati", "Australian Dollar", "AUD", "Cent");
		 Klist k3 = new Klist("Korea, North", "North Korean Won", "KPW", "Chon");
		 Klist k4 = new Klist("Korea, South", "South Korean Won", "KRW", "Jeon");
		 Klist k5 = new Klist("Kosovo", "Euro", "EUR", "Cent");
		 Klist k6 = new Klist("Kuwait", "Kuwaiti Dinar", "KWD", "Fils");
		 Klist k7 = new Klist("Kyrgyzstan", "Kyrgyzstani Som", "KGS", "Tyiyn");

		 lists.add(k0);
		 lists.add(k1);
		 lists.add(k2);
		 lists.add(k3);
		 lists.add(k4);
		 lists.add(k5);
		 lists.add(k6);
		 lists.add(k7);
		 
		 for(Klist e: lists) {
			System.out.println(e.toString());
		 }
	}
}
	