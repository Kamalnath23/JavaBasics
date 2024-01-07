package digitcount;
import java.util.*;
public class DigitCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		if(n>0) {
			String s= String.valueOf(n);
			char CA[]= s.toCharArray();
			System.out.println("Enter a digit");
			char d=sc.next().charAt(0);
			
			for(int i=0;i<CA.length;i++) {
				if(CA[i]==d) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(d+" appears "+n+ " is "+ count);
			}
			
		}
		else {
			System.out.println("Invalid number ");
			return;
		}

	}

}
