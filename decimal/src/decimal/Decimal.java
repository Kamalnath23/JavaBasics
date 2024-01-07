package decimal;

import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter double decimal value: ");
		double dvalue=sc.nextDouble();
		System.out.println("Enter floating point value: ");
		float fvalue=sc.nextFloat();
		
		System.out.println("println d o/p: "+dvalue);
		System.out.println("println f o/p: "+fvalue);
		
		System.out.printf("c2dp: %.2f %.2f",dvalue,fvalue);
		
		System.out.println("\nVALUE"+String.format("%.3f", fvalue));

	}

}
