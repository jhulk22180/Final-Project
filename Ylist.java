package finalpro;

public class Ylist{
	
	static ArrayList<Ylist> list =  new ArrayList<Ylist>();

	public Ylist(String name, String currency,String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Ylist y0 = new Zlist("Yemen", "Yemini Rial","YER", "Fils");
		list.add(y0);
		for(Ylist e: list) {
			System.out.println(e.toString());
		}
		
	}

}
