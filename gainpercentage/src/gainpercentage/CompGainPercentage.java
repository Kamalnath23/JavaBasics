package gainpercentage;

import java.util.Scanner;

public class CompGainPercentage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Price of old scooter:");
		double cp=s.nextDouble();
		System.out.println("The amount spent for repair:");
		double r=s.nextDouble();
		System.out.println("Sold Price:");
		double sp=s.nextDouble();
		
		if(cp<=0 || sp<=0 || r<0) {
			System.out.println("Incorrect Inputs");
		}
		else {
			double gp;
			if((r+cp)<sp) {
			gp=(sp*100)/(r+cp);
			double gp2=gp-100;
			System.out.println("Gain percentage is "+String.format("%.2f", gp2));
			}
			else {
				System.out.println("Unable to calculate gp");
			}
		}

	}

}
