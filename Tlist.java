package finalpro;

import java.util.ArrayList;

public class Tlist {

	static ArrayList<Tlist> list =  new ArrayList<Tlist>();

	public Tlist(String name, String currency, String iso, String frac) {
		super(name, currency,iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Tlist t0 = new Tlist("Taiwan","New Taiwan dollar","	TWD","Cent");
		Tlist t1 = new Tlist("Tajikistan","	Tajikistani somoni","TJS","Diram");
		Tlist t2 = new Tlist("Tanzania","Tanzanian shilling","TZS","Fils");
		Tlist t3 = new Tlist("Thailand","Thai baht","THB","Satang");
		Tlist t4 = new Tlist("Togo","West African CFA franc","XOF","Centime");
		Tlist t5 = new Tlist("Tonga","Tongan pa anga","TOP","Seniti");
		Tlist t6 = new Tlist("Transnistria","Transnistrian ruble","PRB","Kopek");
		Tlist t7 = new Tlist("Trinidad and Tobago","Trinidad and Tobago dollar","TTD","Cent");
		Tlist t8 = new Tlist("Tristan da Cunha","British pound","GBP","Penny");
		Tlist t9 = new Tlist("Tunisia","Tunisian dinar","TND","	Millime");
		Tlist t10 = new Tlist("Turkey","Turkish lira","TRY","Kurus");
		Tlist t11 = new Tlist("Turkmenistan","Turkmenistan manat","TMT","Tennesi");
		Tlist t12 = new Tlist("Tuvalu","Tuvaluan dollar","TVD","Cent");
		list.add(t0);
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		list.add(t8);
		list.add(t9);
		list.add(t10);
		list.add(t11);
		list.add(t12);
		for(Tlist e: list) {
			System.out.println(e.toString());
		}
		
	}

}
