package finalpro;

import java.util.ArrayList;

public class Dlist extends IDlist {
	
	static ArrayList<Dlist> list = new ArrayList<Dlist>();
	public Dlist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
	}
	
	public static void print() {
		Dlist d0 = new Dlist("Denmark", "Danish krone", "DKK", "Ore");
		list.add(d0);
		Dlist d1 = new Dlist("Djibouti", "Djiboutian franc", "DJF", "Centime");
		list.add(d1);
		Dlist d2 = new Dlist("Domninica", "Eastern Caribbean", "XCD", "Cent");
		list.add(d2);
		Dlist d3 = new Dlist("Dominican Republic", "Dominican peso", "DOP", "Centavo");
		list.add(d3);
		for(Dlist e: list) {
			System.out.println(e.toStringA());
			
		}
	}

}
