package evenuppercaps;
import java.util.*;
import java.util.regex.*;
public class EvenPositionsUpperCaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string");
		String s = sc.nextLine();
		if (!Pattern.matches("[A-Za-z]+", s)) {
		System.out.println(s + " is an invalid input");
		return;
		} 
		else {
			if (s.length() < 5 || s.length() > 20) {
				System.out.println(s + " is an invalid length");
				return;
			}
			
			String output= s.charAt(0)+"";
			//System.out.println(output);
			for(int i=0;i<s.length()-1;i++) {
				if(i%2==0) {
					output= output + Character.toString(s.charAt(i+1)).toUpperCase();
				}
				else
				{
					output=output+ s.charAt(i+1);
				}
				
			}
			System.out.println(output);
	}

  }
}
