package arraystrings;

import java.util.*;
public class TwoWordsOfSameLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two words: ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		StringBuilder sb1= new StringBuilder();
		s1.chars().distinct().forEach(c->sb1.append((char)c));
		StringBuilder sb2= new StringBuilder();
		s2.chars().distinct().forEach(c->sb2.append((char)c));
		
		String s3=sb1.toString();
		String s4=sb2.toString();
		System.out.println("s3&s4 are: "+s3+" "+s4+".");
		
		char[] c1=s3.toCharArray();
		char[] c2=s4.toCharArray();
		for(char b:c1)
		System.out.println("c1: "+b);
		for(char d:c2)
			System.out.println("c2"+d);
		
		System.out.println("After sorting");
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
		
		if(Arrays.equals(c1,c2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different.");
		}
	}

}
