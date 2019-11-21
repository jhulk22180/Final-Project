package finalpro;

public class Rlist {
	static ArrayList<Rlist> list =  new ArrayList<Rlist>();

	public Ulist(String name, String currency, String iso, String frac) {
		super(name, currency,iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Rlist r0 = new Rlist("Romania","Romanian leu","RON","Ban");
		Rlist r1 = new Rlist("Russia","Russian ruble","RUB","Kopek");
		Rlist r2 = new Rlist("Rwanda","Rwandan franc","RWF","Centime");
		for(Rlist e: list) {
			System.out.println(e.toString());
		}
	}
}