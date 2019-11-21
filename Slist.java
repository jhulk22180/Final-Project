package finalpro;

public class Slist {

	static ArrayList<Slist> list =  new ArrayList<Slist>();

	public Ulist(String name, String currency, String iso, String frac) {
		super(name, currency,iso, frac);
		// TODO Auto-generated constructor stub
	}
	public static void print() {
		Slist s0 = new Slist("Saint Helena","Saint Helena pound","SHP","Penny");
		Slist s1 = new Slist("Saint Kitts and Nevis","Eastern Caribbean dollar","XCD","Cent");
		Slist s2 = new Slist("Samoa","Samoan tala","WST","Sene");
		Slist s3 = new Slist("San Marino","Euro","EUR","Cent");
		Slist s4 = new Slist("São Tomé and Príncipe","São Tomé and Príncipe dobra","STN","Cêntimo");
		Slist s5 = new Slist("Saudi Arabia","Saudi riyal","SAR","Halala");
		Slist s6 = new Slist("Senegal","Senegal","XOF","Centime");
		Slist s7 = new Slist("Serbia","Serbian dinar","RSD","Para");
		Slist s8 = new Slist("Seychelles","Seychellois rupee","SCR","Cent");
		Slist s9 = new Slist("Sierra Leone","Sierra Leonean leone","SLL","Cent");
		Slist s10 = new Slist("Singapore","Singapore dollar","SGD","Cent");
		Slist s11 = new Slist("Sint Eustatius","United States dollar","USD","Cent");
		Slist s12 = new Slist("Sint Maarten","Netherlands Antillean guilder","ANG","Cent");
		Slist s13 = new Slist("Slovakia","Euro","EUR","Cent");
		Slist s14 = new Slist("Slovenia","Euro","EUR","Cent");
		Slist s15 = new Slist("Solomon Islands","Solomon Islands dollar","SBD","Cent");
		Slist s16 = new Slist("Somalia","Somali shilling","SOS","Cent");
		Slist s17 = new Slist("Somaliland","Somaliland shilling","SLS","Cent");
		Slist s18 = new Slist("South Africa","South African rand","ZAR","Cent");
		Slist s19 = new Slist("South Georgia and the South Sandwich Islands","British pound","GBP","Penny");
		Slist s20 = new Slist("South Ossetia","Russian ruble","RUB","Kopek");
		Slist s21 = new Slist("South Sudan","South Sudanese pound","SSP","Piastret");
		Slist s22 = new Slist("Spain","Euro","EUR","Cent");
		Slist s23 = new Slist("Sri Lanka","Sri Lankan rupee","LKR","Cent");
		Slist s24 = new Slist("Sudan","Sudanese pound","SDG","Piastre");
		Slist s25 = new Slist("Suriname","Surinamese dollar","SRD","Cent");
		Slist s26 = new Slist("Sweden","Swedish krona","SEK","Ore");
		Slist s27 = new Slist("Switzerland","Swiss franc","CHF","Centime");
		Slist s28 = new Slist("Syria","	Syrian pound","SYP","Piastre");
		for(Slist e: list) {
			System.out.println(e.toString());
		}
		
	}

}

