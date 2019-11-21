package finalpro;

import java.util.ArrayList;

public class Clist extends IDlist {

	static ArrayList<Clist> list = new ArrayList<Clist>();
	public Clist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
	}
	
	public static void print() {
		Clist c0 = new Clist("Cambodia", "Cambodian riel" , "KHR", "Sen");
		list.add(c0);
		Clist c1 = new Clist("Cambodia", "United States dollar", "USD", "Cent");
		list.add(c1);
		Clist c2 = new Clist("Cameroon", "Central African CFA franc", "XAF", "Centime");
		list.add(c2);
		Clist c3 = new Clist("Canada", "Canadian dollar", "CAD", "Cent");
		list.add(c3);
		Clist c4 = new Clist("Cape Verde", "Cape Verdean escudo", "CVE", "Centavo");
		list.add(c4);
		Clist c5 = new Clist("Cayman Islands", "Cayman Islands dollar", "KYD", "Cent");
		list.add(c5);
		Clist c6 = new Clist ("Central African Republic", "Central African CFA franc", "XAF", "Centime");
		list.add(c6);
		Clist c7 = new Clist("Chad", "Central African franc", "XAF", "Centime");
		list.add(c7);
		Clist c8 = new Clist("Chile", "Chilean peso", "CLP", "Centavo");
		list.add(c8);
		Clist c9 = new Clist("China", "Chinese yuan", "CNY", "Fen");
		list.add(c9);
		Clist c10 = new Clist("Cocos Islands", "Australian dollar", "AUD", "Cent");
		list.add(c10);
		Clist c11 = new Clist("Colombia", "Colombian peso", "COP", "Centavo");
		list.add(c11);
		Clist c12 = new Clist("Comoros", "Comorian franc", "KMF", "Centime");
		list.add(c12);
		Clist c13 = new Clist("Congo", "Congolese franc", "CDF", "Centime");
		list.add(c13);
		Clist c14 = new Clist("Cook Islands", "New Zealand dollar", "NZD", "Cent");
		list.add(c14);
		Clist c15 = new Clist("Costa Rica", "Costa Rican colon", "CRC", "Centimo");
		list.add(c15);
		Clist c16 = new Clist("Cote d'lvoire", "West African CFA franc", "XOF", "Centime");
		list.add(c16);
		Clist c17 = new Clist("Croatia", "Croatian kuna", "HRK", "Lipa");
		list.add(c17);
		Clist c18 = new Clist("Cuba", "Cuban peso", "CUP", "Centavo");
		list.add(c18);
		Clist c19 = new Clist("Cuba", "Cuban convertible peso", "CUC", "Centavo");
		list.add(c19);
		Clist c20 = new Clist("Curacao", "Netherlands Antillean guilder", "ANG", "Cent");
		list.add(c20);
		Clist c21 = new Clist("Cyprus", "Euro", "EUR", "Cent");
		list.add(c21);
		Clist c22 = new Clist("Czech Republic", "Czech koruna", "CZK", "Haler");
		list.add(c22);
		for(Clist e: list) {
			System.out.println(e.toString());
			
		}
	}
	

}
