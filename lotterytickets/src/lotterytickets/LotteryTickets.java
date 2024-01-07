package lotterytickets;

import java.util.Scanner;

public class LotteryTickets {

	public static void main(String[] args) {
		
		int sum=0, count=0;
		int x=0,y=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the starting range: ");
		int a=sc.nextInt();
		String s1=Integer.toString(a);
		if(s1.length()!=5) {
			System.out.println(s1+ " is an Invalid Input.");
			return;
		}
		
		System.out.println("Enter the ending range: ");
		int b=sc.nextInt();
		String s2=Integer.toString(b);
		if(s2.length()!=5) {
			System.out.println(s2+ " is an Invalid Input.");
			return;
		}
		
		if(a>b) {
			System.out.println(a+" and "+b+"are invalid serial numbers");
			return;
		}
		
		
		for(int i=a;i<=b;i++) {
			x=i;
			while(x!=0) {
				y=x%10;
				sum=sum+y;
				x=x/10;
			}
			
			if((sum%3==0) && (sum/3)%2==0) {
				System.out.println(i+" ");
				count++;
				
			}
			
			sum=0;
		}
		
		if(count==0) {
			System.out.println("Eligible tickets are avaiable from "+a+" to "+b);
			return;
		}

	}

}
