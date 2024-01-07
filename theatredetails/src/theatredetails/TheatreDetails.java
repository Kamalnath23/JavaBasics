package theatredetails;
import java.util.*;
import java.util.regex.Pattern;
public class TheatreDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		if(str.length()!=10) {
			System.out.println("invalid");
			return;
		}
		
		String sns= str.substring(5,7);
		int sn= Integer.parseInt(sns);
		
		if(Pattern.matches("[0-9]+", sns) && sn>1 && sn<10) {
			String l8= str.substring(7,8);
			String starts= str.substring(8,10);
			int start= Integer.parseInt(starts);
			
			if(Pattern.matches("[A-Z]+", l8) && Pattern.matches("[0-9]+", starts)) {
				for(int i=0;i<sn;i++) {
					System.out.println(l8+start++);
				}
			}
			else {
				System.out.println("Invalid seat number");
			}
		}
		else {
			System.out.println("Invalid count");
			return;
		}
		
	}

}
