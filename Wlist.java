package finalpro;

public class Wlist{
	
	static ArrayList<Wlist> list =  new ArrayList<Wlist>();

	public Wlist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Wlist w0 = new Wlist("Wallis and Futuna", "CFP franc","XPF", "Centime");
		for(Wlist e: list) {
			System.out.println(e.toString());
		}
		
	}

}
