package finalpro;

import java.util.ArrayList;

public class Blist extends IDlist {
	
	static ArrayList<Blist> list =  new ArrayList<Blist>();

	public Blist(String name, String currency, String iso, String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Blist b0 = new Blist("Bahamas", "Bahamian dollar", "BSD", "Cent");
		list.add(b0);
		Blist b1 = new Blist("Bahrain", "Bahraini dinar", "BHD", "Fils");
		list.add(b1);
		Blist b2 = new Blist("Bangladesh", "Bangladeshi taka", "BDT", "Poisha");
		list.add(b2);
		Blist b3 = new Blist("Barbados", "Barbadian dollar", "BBD", "Cent");
		list.add(b3);
		Blist b4 = new Blist("Belarus", "Belarusian ruble", "BYN", "Kapyeyka");
		list.add(b4);
		Blist b5 = new Blist("Belgium", "Euro", "EUR", "Cent");
		list.add(b5);
		Blist b6 = new Blist("Belize", "Belize dollar", "BZD", "Cent");
		list.add(b6);
		Blist b7 = new Blist("Benin", "West African CFA franc", "XOF", "Centime");
		list.add(b7);
		Blist b8 = new Blist("Bermuda", "Bermudian dollar", "BMD", "Cent");
		list.add(b8);
		Blist b9 = new Blist("Bhutan", "Bhutanese ngultrum", "BTN", "Chetrum");
		list.add(b9);
		Blist b10 = new Blist("Bhutan", "Indian rupee", "INR", "Paisa");
		list.add(b10);
		Blist b11 = new Blist("Bolivia", "Bolivian boliviano", "BOB", "Centavo");
		list.add(b11);
		Blist b12 = new Blist("Bonaire", "United States dollar", "USD", "Cent");
		list.add(b12);
		Blist b13 = new Blist("Bosnia and Herzegovina", "Bosnia and Herzegovina convertible mark", "Bam", "Fening");
		list.add(b13);
		Blist b14 = new Blist("Botswana", "Botswana pula", "BWP", "Thebe");
		list.add(b14);
		Blist b15 = new Blist("Brazil", "Brazillian real", "BRL", "Centavo");
		list.add(b15);
		Blist b16 = new Blist("British Indian Ocean Territory", "United States dollar", "USD", "Cent");
		list.add(b16);
		Blist b17 = new Blist("British Virgin Islands", "United States dollar", "USD", "Cent");
		list.add(b17);
		Blist b18 = new Blist("Brunei", "Brunei dollar", "BND", "Sen");
		list.add(b18);
		Blist b19 = new Blist("Brunei", "Singapore dollar" , "SGD", "Cent");
		list.add(b19);
		Blist b20 = new Blist("Bulgaria", "Bulgarian lev", "BGN", "Stotinka");
		list.add(b20);
		Blist b21 = new Blist("Burkina Faso", "West African CFA franc", "XOF", "Centime");
		list.add(b21);
		Blist b22 = new Blist("Burundi","Burundian franc", "BIF", "Centime");
		list.add(b22);
		for(Blist e: list) {
			System.out.println(e.toString());
		}
		
	}

}
