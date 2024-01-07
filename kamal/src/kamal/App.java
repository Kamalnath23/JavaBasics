package kamal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:\n");
		int n=sc.nextInt();
		int d=0,rem=0;
		if(n<0) {
			System.out.println("Number should be positive");
		}
		if(n==0) {
			System.out.println("0");
		}
		else  {
			while(n>0) {
				d=n%10;
				rem=(rem*10)+d;
				n=n/10;
			}
			System.out.println("The reverse number is "+rem +".");
		}

	}

}
