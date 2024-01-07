package learn;
import java.util.*;
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "hi bro";
		int n= s.length();
		System.out.println(n);
		
		
		Scanner in = new Scanner(System.in);
		 System.out.println("Enter the String");
		 String str =in.nextLine();
		 for(int i=0;i<str.length();i++)
		 {
		 if((Character.isLetter(str.charAt(i)) || Character.isWhitespace(str.charAt(i))))
		 continue;
		 else{
		 System.out.println(str+" is not a valid string");
		 return;
		 }
		 }
		 int sum=0;
		 for(int i=0;i<str.length();i++){
		 if((i+1)%3==0){
		 sum+=str.charAt(i);
		 }
		 }
		 System.out.println("Sum is "+sum);

	}

}
