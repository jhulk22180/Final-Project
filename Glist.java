package finalpro;
import java.util.ArrayList;
public class Glist extends IDlist {
	static ArrayList<Glist> lists = new ArrayList<Glist>();
	public Glist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Glist g0 = new Glist("Gabon", "Central African CFA Franc", "XAF", "Centime");
		 Glist g1 = new Glist("Gambia", "Gambian Dalasi", "GMD", "Butut");
		 Glist g2 = new Glist("Georgia", "Georgian Lari", "GEL", "Tetri");
		 Glist g3 = new Glist("Germany", "Euro", "EUR", "Cent");
		 Glist g4 = new Glist("Ghana", "Ghanaian Cedi", "GHS", "Pesewa");
		 Glist g5 = new Glist("Gibraltar", "Gibraltar Pound", "GIP", "Penny");
		 Glist g6 = new Glist("Greece", "Euro", "EUR", "Cent");
		 Glist g7 = new Glist("Grenada", "Eastern Caribbean Dollar", "XCD", "Cent");
		 Glist g8 = new Glist("Guatemala", "Guatemalan quetzal", "GTQ", "Centavo");
		 Glist g9 = new Glist("Guernsey", "Guernsey Pound", "GGP", "Penny");
		 Glist g10 = new Glist("Guinea", "Guinea Franc", "GNF", "Centime");
		 Glist g11 = new Glist("Guinea-Bissau", "West African CFA Franc", "XOF", "Centime");
		 Glist g12 = new Glist("Guyana", "Guyanese Dollar", "GYD", "Cent");
		 
		 lists.add(g0);
		 lists.add(g1);
		 lists.add(g2);
		 lists.add(g3);
		 lists.add(g4);
		 lists.add(g5);
		 lists.add(g6);
		 lists.add(g7);
		 lists.add(g8);
		 lists.add(g9);
		 lists.add(g10);
		 lists.add(g11);
		 lists.add(g12);

		for(Glist e: lists) {
			System.out.println(e.toString());
			
		}
		
	}
	
}
