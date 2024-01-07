package harshadnumber;
import java.util.*;
public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check weather a number is harshad.no or not");
		int num=sc.nextInt();
		
		int x=num;
		int y;
		int sum=0;
		
		while(x>0) {
			y=x%10;
			sum=sum+y;
			x=x/10;
		}
		
		if(num%sum==0) {
			System.out.println(num+" is a Harshad number");
		}
		else {
			System.out.println(num+" is Not a harshad number.");
		}



	}

}
