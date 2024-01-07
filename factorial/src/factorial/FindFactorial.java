package factorial;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		int fact=1,x=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to determine fact or not: ");
		int num=s.nextInt();
		if(num<0) {
			System.out.println("Invalid Input");
		}
		else {
			while(num>fact) {
				x+=1;
				fact=fact*x;
			}
			if(fact==num) {
				System.out.println(x+" The number is perfect factorial.");
			}
			else {
				System.out.println("Sorry! The given number is not a perfect factorial.");
			}
		}

	}

}
