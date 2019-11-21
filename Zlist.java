package finalpro;

public class Zlist{
	
	static ArrayList<Zlist> list =  new ArrayList<Zlist>();

	public Zlist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Zlist z0 = new Zlist("Zambia", "Zambian Kwacha","ZMW", "Ngwee");
		Zlist z1 = new Zlist("Zimbabwe","Zimbabwean Dollar","ZWD","Cent");
		for(Zlist e: list) {
			System.out.println(e.toString());
		}
		
	}

}
