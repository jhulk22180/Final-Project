package finalpro;

public class Ulist {

	static ArrayList<Ulist> list =  new ArrayList<Ulist>();

	public Ulist(String name, String currency, String iso, String frac) {
		super(name, currency,iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Ulist u0 = new Ulist("Uganda","Ugandan shilling","UGX","Cent");
		Ulist u1 = new Ulist("Ukraine","Ukrainian hryvnia","UAH","Kopiyka");
		Ulist u2 = new Ulist("United Arab Emirates","United Arab Emirates dirham","AED","Fils");
		Ulist u3 = new Ulist("United Kingdom","British pound","GBP","Penny");
		Ulist u4 = new Ulist("United States","United States dollar","USD","Cent");
		Ulist u5 = new Ulist("Uruguay","Uruguayan peso","UYU","Centésimo");
		Ulist u6 = new Ulist("Uzbekistan","Uzbekistani so m","UZS","Tiyin");
		for(Ulist e: list) {
			System.out.println(e.toString());
		}
		
	}

}
