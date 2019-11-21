package finalpro;
import java.util.*;
import finalpro.main;
public class IDlist extends main implements Territory{
	private String name;
	private String currency;
	private String iso;
	private String frac;
	
	
	public IDlist(String name, String currency, String iso, String frac) {
		this.name = name;
		this.currency = currency;
		this.iso = iso;
		this.frac = frac;
	}
	
	public static void print() {
		Scanner scan = new Scanner(System.in);
		System.out.println("**CONVERTER MENU**");
		System.out.println("Press 1 to display out all territories with their associated currency information.");
		System.out.println("Press 2 to display all ISO codes");
		System.out.println("Press 3 to go back to main menu");
		int num = scan.nextInt(); 
		switch(num) {
		case 1:
			System.out.println("***Countries starting with letter A:");
			Alist.print();
			Blist.print();
			break;
		case 2:
			Alist.printISO();
			
			
		case 3:
			System.out.println();
			String[] args = null;
			main.main(args);
		
		}
		
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return currency;
	}

	@Override
	public String fractionUnit() {
		// TODO Auto-generated method stub
		return frac;
	}

	@Override
	public String isoCode() {
		// TODO Auto-generated method stub
		return iso;
	}
	
	public String toString() {
		return "" + "\n" + "Territory" + name + " | " + "Currency:" + currency + " | " + "ISO code:" + iso + " | " + "Fractional Unit:" + frac;
		
	}
	
	public String toStringISO() {
		
		return "" + currency + ": " + iso;
		
	}
}
