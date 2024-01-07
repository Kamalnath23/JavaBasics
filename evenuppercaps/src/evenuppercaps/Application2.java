package evenuppercaps;
import java.util.*;
import java.util.regex.Pattern;
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		int l=s.length();
		if(Pattern.matches("[A-Za-z]+", s)){
			if(l<3) {
				System.out.println("length of word is short");
				return;
			}
		if(l>8) {
			System.out.println("length of word is too long");
			return;
		}
		
		
			for(int i=0;i<l;i++) {
				if(i%2==0) {
					System.out.print(String.valueOf(s.charAt(i)).toLowerCase());
				}
				else {
					System.out.print(String.valueOf(s.charAt(i)).toUpperCase());
				}
			}
		}
		else  {
			System.out.println("invalid string");
			return;
		}
		

	}

}
