package middleletter;
import java.util.*;
public class practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="kamal";
		
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
		
		StringBuffer sbu= new StringBuffer(s);
		sbu.reverse();
		System.out.println(sbu.toString());
		
		StringBuffer sbuf= new StringBuffer(s);
		sbuf.append(" nath");
		System.out.println(sbuf.toString());
		
		System.out.println("PANLINDROME CHECK. Enter string");
		String str= sc.next();
		StringBuilder sb1= new StringBuilder(str);
		sb1.reverse();
		String strop=sb1.toString();
		System.out.println("reverse: "+strop);
		if(str.equals(strop)) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
