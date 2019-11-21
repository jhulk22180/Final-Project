package finalpro;

import java.util.ArrayList;

public class Alist extends IDlist {
	static int count = 0;
	static ArrayList<Alist> list = new ArrayList<Alist>();
	public Alist(String name, String currency, String iso,
			String frac) {
		super(name, currency, iso, frac);
		// TODO Auto-generated constructor stub
	}
	
	public static void print() {
		 Alist a0 = new Alist("Abkhazia", "Russian ruble", "RUB", "Kopek");
		 list.add(a0);
		 Alist a1 = new Alist("Afghanistan", "Afghan afghani", "AFN", "Pul");
		 list.add(a1);
		 Alist a2 = new Alist("Akrotiri and Dhekelia", "Euro", "EUR", "Cent");
		 list.add(a2);
		 Alist a3 = new Alist("ALbania", "Albanian lek", "ALL", "Qindarke");
		 list.add(a3);
		 Alist a4 = new Alist("Alderney", "British pound", "GBP", "Penny");
		 list.add(a4);
		 Alist a5 = new Alist("Algeria", "Algerian dinar", "DZD", "Santeem");
		 list.add(a5);
		 Alist a6 = new Alist("Andorra", "Euro", "EUR", "Cent");
		 list.add(a6);
		 Alist a7 = new Alist("Angola", "Angolan kwanza", "AOA", "Centimo");
		 list.add(a7);
		 Alist a8 = new Alist("Anguilla","Eastern Caribbean dollar", "XCD", "Cent");
		 list.add(a8);
		 Alist a9 = new Alist("Antigua and Barbuda", "Eastern Caribbean dollar", "XCD", "Cent");
		 list.add(a9);
		 Alist a10 =  new Alist("Argentina", "Argentine peso", "ARS", "Centavo");
		 list.add(a10);
		 Alist a11 = new Alist("Armenia", "Armenian dram", "AMD", "Luma");
		 list.add(a11);
		 Alist a12 = new Alist("Artsakh", "Armeanian dram", "AMD", "Luma");
		 list.add(a12);
		 Alist a13 = new Alist("Aruba", "Aruban florin", "AWG", "Cent");
		 list.add(a13);
		 Alist a14 = new Alist("Ascension Island", "Saint Helena pound", "SHP", "Penny");
		 list.add(a14);
		 Alist a15 = new Alist("Australia", "Australian dollar", "AUD", "Cent");
		 list.add(a15);
		 Alist a16 = new Alist("Austria", "Euro", "EUR", "Cent");
		 list.add(a16);
		 Alist a17 = new Alist("Azerbaijan", "Azerbaijani", "AZN", "Qepik");
		 list.add(a17);
		for(Alist e: list) {
			System.out.println(e.toString());
			
		}
		
	}
	
	public static void printISO() {
		Alist a0 = new Alist("Abkhazia", "Russian ruble", "RUB", "Kopek");
		 list.add(a0);
		 Alist a1 = new Alist("Afghanistan", "Afghan afghani", "AFN", "Pul");
		 list.add(a1);
		 Alist a2 = new Alist("Akrotiri and Dhekelia", "Euro", "EUR", "Cent");
		 list.add(a2);
		 Alist a3 = new Alist("ALbania", "Albanian lek", "ALL", "Qindarke");
		 list.add(a3);
		 Alist a4 = new Alist("Alderney", "British pound", "GBP", "Penny");
		 list.add(a4);
		 Alist a5 = new Alist("Algeria", "Algerian dinar", "DZD", "Santeem");
		 list.add(a5);
		 Alist a6 = new Alist("Andorra", "Euro", "EUR", "Cent");
		 list.add(a6);
		 Alist a7 = new Alist("Angola", "Angolan kwanza", "AOA", "Centimo");
		 list.add(a7);
		 Alist a8 = new Alist("Anguilla","Eastern Caribbean dollar", "XCD", "Cent");
		 list.add(a8);
		 Alist a9 = new Alist("Antigua and Barbuda", "Eastern Caribbean dollar", "XCD", "Cent");
		 list.add(a9);
		 Alist a10 =  new Alist("Argentina", "Argentine peso", "ARS", "Centavo");
		 list.add(a10);
		 Alist a11 = new Alist("Armenia", "Armenian dram", "AMD", "Luma");
		 list.add(a11);
		 Alist a12 = new Alist("Artsakh", "Armeanian dram", "AMD", "Luma");
		 list.add(a12);
		 Alist a13 = new Alist("Aruba", "Aruban florin", "AWG", "Cent");
		 list.add(a13);
		 Alist a14 = new Alist("Ascension Island", "Saint Helena pound", "SHP", "Penny");
		 list.add(a14);
		 Alist a15 = new Alist("Australia", "Australian dollar", "AUD", "Cent");
		 list.add(a15);
		 Alist a16 = new Alist("Austria", "Euro", "EUR", "Cent");
		 list.add(a16);
		 Alist a17 = new Alist("Azerbaijan", "Azerbaijani", "AZN", "Qepik");
		 list.add(a17);
		 for(Alist e: list) {
			 count++;
				System.out.println("(" + count + ")" + e.toStringISO());
				
	}
	
}
}
