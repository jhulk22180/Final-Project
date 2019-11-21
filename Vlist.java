package finalpro;

public class Vlist{
	
	static ArrayList<Vlist> list =  new ArrayList<Vlist>();

	public Vlist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Vlist v0 = new Vlist("Vanuatu", "Vanuatu vatu","VUV", "None");
		Vlist v1 = new Vlist("Vatican City","Euro","EUR","Cent");
		Vlist v2 = new Vlist("Venezuela","Venezuelan bolívar soberano","VES","Hào");
		Vlist v3 = new Vlist("Vietnam","Vietnamese dong","VND","Cent");
		for(Vlist e: list) {
			System.out.println(e.toString());
		}
		
	}

}
