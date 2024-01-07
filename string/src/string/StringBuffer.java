package string;

import java.util.*;
import java.lang.*;
public class StringBuffer {
	public static void main(String[] args) {
		//StringBuffer sb= new StringBuffer();
		//sb.append("Java");
		//sb.append(" program");
		//sb.append(" is a OO program");
		
		//System.out.println(sb.toString());
		
		
		StringBuilder s=new StringBuilder("");
		s.append("I am steve rogers")
		.append(" captain of america")
		.append(" i am the first avenger.");
		s.append("\n avengers assemble");
		String sb=s.toString();
		System.out.println(sb.toUpperCase());
		System.out.println(s.toString());
		
		
	}

}
