package finalpro;

public class Qlist {
	static ArrayList<Qlist> list =  new ArrayList<Qlist>();

	public Ulist(String name, String currency, String iso, String frac) {
		super(name, currency,iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Qlist q0 = new Qlist("Qatar","Qatari riyal","QAR","Dirham");
		for(Qlist e: list) {
			System.out.println(e.toString());
		}
	}
}