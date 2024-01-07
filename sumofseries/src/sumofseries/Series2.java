package sumofseries;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int f=s.nextInt();
		System.out.println("Enter no.of.terms: ");
		int n=s.nextInt();
		
		int sum=0;
		
		for(int i=f;i<f+n;i++) {
			sum+=i*(i+1)*(i+2);
			System.out.println("At Each process "+sum);
		}
		System.out.println("Series ans is: "+sum);

	}

}
