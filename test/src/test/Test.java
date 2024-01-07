package test;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Test {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=input.nextInt();
				
				int d=0,rev=0;
				if(n<0) {
					System.out.println("Number should be positive");
				}
				
				else {
					while(n>0) {
					d=n%10;
					rev=(rev*10)+d;
					n=n/10;
				}
				}
		System.out.println("The reversed number is "+rev);
				
	}
	

}
