package string;
import java.util.*;
public class App {

	public static void main(String[] args) {
	
		int count=0,sum=2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		
		for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)) || s.charAt(i)==' ' ){
			continue;
		}
		else
		{
			System.out.println(s+" is Invalid String");
			return;
		}
		}
		
		System.out.println("Enter the sentence");
		String sentence=sc.next();
		String w[]= sentence.split(" ");
		
		for(int i=0;i<w.length;i++) {
			if(w[i].equalsIgnoreCase(s)) {
				count++;
				if(count>2) {
					sum=sum*2;
				}
			}
		}
		
		if(count>2)
		{
			System.out.println("Score is "+sum);
			}
		else {
			System.out.println("Score is "+count);
		}
		
		//try
		System.out.println("(test) Score is "+((int)Math.pow(2, count)));
		
		}
	
	

}
