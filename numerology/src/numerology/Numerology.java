package numerology;
import java.util.*;
import java.util.regex.Pattern;
public class Numerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.nextLine();
		if(Pattern.matches("[A-Za-z]+",str)) {
		
			
			String s=str.toLowerCase();
		
			int sum=0, ch=0;
		
			for(int i=0;i<s.length();i++) {
				char c=s.charAt(i);
			
				if(c>='a' && c<='z') {
					ch= c-96;
					sum+=ch;
				}
			}
			System.out.println(sum);
			if(sum%3==0 && sum %2==0) {
				System.out.println(sum+" is a numerology number");
			}
			else {
				System.out.println(sum+" is not a numerology number");
			}
		
		}
		else {
			System.out.println(str+ " is an invalid format");
		}

	}

}
