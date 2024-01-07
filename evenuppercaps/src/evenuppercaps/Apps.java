package evenuppercaps;
import java.util.*;
import java.util.regex.Pattern;
public class Apps {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		
		if(!Pattern.matches("[A-Za-z]+" , s)) {
			System.out.println("Invalid string");
			return;
		}
		else {
			if(s.length()>5 && s.length()<20) {
				StringBuffer sb=new StringBuffer();
				char chararray[]= s.toCharArray();
				for(int i=0;i<s.length();i++) {
					char ch= chararray[i];
					
					if(i%2!=0) {
						ch=Character.toUpperCase(ch);
						
					}
				sb.append(ch);			
				}
				System.out.println(sb.toString());		
			}
			else{
				System.out.println("Invalid");
				return;
			}
			}
			
			
			
		
	}

}

