package rt2practice;
import java.util.*;
public class HolidayTrip3 {
	
	public static void main(String[] args) {
		int tc=0,bc=0,ec=0;
		double d=0,cp=0;
		double sd=0;
		double p=0,price=0;
		double total_price=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the flight name:");
		String f=sc.next();
		System.out.println("Enter the class");                            // CLASS
		String c=sc.next();
		System.out.println("Enter the number of seats:");                         //SEATS
		int n=sc.nextInt();
		
		
		System.out.println("Card Payment:");                            //payment
		String cp2=sc.next();
		
		switch(f) {
		case "AirIndia":
			tc=3200;
			ec=6950;
			bc=10340;
			cp=00.105;
			break;
			
		case "SpiceJet":
			tc=3450;
			ec=7945;
			bc=9500;
			cp= 0.075;
			break;
			
		case "GoAir":
			tc=3490;
			ec=7650;
			bc=9890;
			cp=0.095;
			break;
			
		case "IndiGo":
			tc=3490;
			ec=7560;
			bc=9990;
			cp=0.085;
			break;
		
		default:
			System.out.println(f+" Invalid Airline");
			break;
			
		}
		
		switch(c) {
		case "Travelclass":
			p=tc;
			d=tc*cp;
			break;
			
		case "Economyclass":
			p=ec;
			d=ec*cp;
			break;
			
		case "Businessclass":
			p=bc;
			d=bc*cp;
			break;
		default:
			System.out.println(c+" Invalid class");
			break;	
		
		}
		
		if(n<0) {
			System.out.println("Invalid no of seats");
			return;
		}
		
		else if(n>5 || n<10 ) {
			switch(c) {
				case "IndiGo":
					sd=0.10;
					break;
				
				case "SpiceJet":
					sd=0.10;
					break;
				
				default:
					sd=0;
					break;
			}
			
		}
		else if(n>10) {
			switch(c) {
			case "IndiGo":
				sd=0.15;
				break;
			
			case "SpiceJet":
				sd=0.15;
				break;
			
			default:
				sd=0;
				break;
			}
			
		}
		else {
			sd=0;
		}
		System.out.println(sd+" sd");
		
		
		if(cp2.equalsIgnoreCase("Y")) {
			System.out.println(total_price=(n*(p-d))-(sd*(n*(p-d))));
		}
		else if(cp2.equalsIgnoreCase("N")) {
			System.out.println(total_price=(n*p)-(sd*(n*p)));
		}
		else {
			System.out.println("INVALID PAYMENT");
			return;
		}
		

		

	}

}
