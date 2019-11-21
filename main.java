package finalpro;
import java.util.*;
public class main {
	
	public static void main(String args[]) {
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Currency Program!\n");
		System.out.println("**MAIN MENU**");
		System.out.println("(1) Currency Converter");
		System.out.println("(2) Trending Graph");
		System.out.println("(3) Exit\n");
		System.out.print("Type corresponding number to continue: " + "\n");
		
		while (num != 3) {
			num = scan.nextInt();
		
		switch(num) {
		case 1: 
			IDlist.print();
			break;
			
		case 2:
			System.out.println("not done yet");
			break;
			
		case 3:
			System.out.println("Program exit successful.");
			System.exit(0);
			
		default:
			System.err.print("Invalid input. Please try again :");
			break;
			
			
		}
		}
		
	}

}
