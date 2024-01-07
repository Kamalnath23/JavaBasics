package coffeestallnumerology;
import java.util.*;
import java.util.regex.Pattern;
public class CoffeStalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the staff name");
		String name=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			if(Character.isAlphabetic(name.charAt(i)) || name.charAt(i)==' ') {
				count++;
			}
		}
		
		if(count==name.length()) {
			
			String str=name.replace(" ","");
			System.out.println(str);
			int sum=0;
			for(int i=0;i<str.length();i++) {
				sum=sum+i;
			}
			
			if(sum%2==0) {
				System.out.println(name+" satisfies numerology logic");
			}
			else {
				System.out.println(name+" does not satisfies numerology logic");
			}
			
		}
		else {
			System.out.println("Invalid input");
		}
		
	}

}
