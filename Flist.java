package finalpro;

public class Flist {
	static ArrayList<Flist> list =  new ArrayList<Flist>();

	public Ulist(String name, String currency, String iso, String frac) {
		super(name, currency,iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Flist f0 = new Flist("Falkland Islands","Falkland Islands pound","FKP","Penny");
		Flist f1 = new Flist("Faroe Islands	","Danish krone","DKK","Ore");
		Flist f2 = new Flist("Fiji","Fijian dollar","FJD","Cent");
		Flist f3 = new Flist("Finland","Euro","EUR","Cent");
		Flist f4 = new Flist("France","Euro","EUR","Cent");
		Flist f5 = new Flist("French Polynesia","CFP franc","XPF","Centime");
		for(Flist e: list) {
			System.out.println(e.toString());
		}
	}
}