package sumofseries;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int f=s.nextInt();
		System.out.println("Enter the no.of terms: ");
		int n=s.nextInt();
		
		int sum=0;
		
		if(f==0 || n==0) {
			System.out.println("Invalid Input");
		}
		else {
			for(int i=f;i<f+n;i++) {
				sum-=i;      //sum=sum-i;
				System.out.print("-"+i);
				if(i+1<f+n) {
					sum=sum+i+1;
					System.out.print("+"+(i+1));
				}
				i++; //avoids doubling
			}
			System.out.println("\nThe result of this series is: "+sum);
		}
		
		if(sum>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative Number");
		}

	}

}
