package learn;
import java.util.*;
import java.util.regex.Pattern;
public class App {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="A2S3D06D13";
		
		//String code=(str.substring(4));
		//System.out.println(code);
		
		int n1=Integer.parseInt(str.substring(5,7)); //no.of.seats
		String l8= (str.substring(7,8)); // seat_type
		int n2=Integer.parseInt(str.substring(8,10)); //seatbstarting ;101440um
		
		if(Pattern.matches("[0-9]+", str.substring(5,7)) && n1>=1 && n1<=10) {
			if(Pattern.matches("[A-Za-z]+",l8) && Pattern.matches("[0-9]+", str.substring(8,10))) {
				for(int i=0;i<n1;i++) {
					System.out.println(l8+ (n2++));
				}
				
			}
			else {
				System.out.println("Invalid seat no");
				return;
			}
		}
		else {
			System.out.println("Invalid count");
			return;
		}
	}

}
