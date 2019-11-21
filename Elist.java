package finalpro;

import java.util.ArrayList;

public class Elist extends IDlist {
	static ArrayList<Elist> list = new ArrayList<Elist>();
	public Elist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
	}
	
	public static void print() {
		Elist e0 = new Elist("East Timor", "United States dollar", "USD", "Cent");
		list.add(e0);
		Elist e1 = new Elist("Ecuador", "United States dollar", "USD","Cent");
		list.add(e1);
		Elist e2 = new Elist("Egypt", "Egyptian pound", "EGP", "Piastre");
		list.add(e2);
		Elist e3 = new Elist("El Salvador", "United States dollar", "USD", "Cent");
		list.add(e3);
		Elist e4 = new Elist("Equatorial Guinea", "Central African CFA franc", "XAF", "Centime");
		list.add(e4);
		Elist e5 = new Elist("Eritrea", "Eritrean nakfa", "ERN", "Cent");
		list.add(e5);
		Elist e6 = new Elist("Estonia", "Euro", "EUR", "Cent");
		list.add(e6);
		Elist e7 = new Elist("Eswatini", "Swazi lilangeni", "SZL", "Cent");
		list.add(e7);
		Elist e8 = new Elist("Ethiopoa", "Ethiopoan birr", "ETB", "Santim");
		list.add(e8);
		for(Elist e: list) {
			System.out.println(e.toStringA());
		}
	}
	

}
