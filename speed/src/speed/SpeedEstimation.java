package speed;
import java.util.*;
public class SpeedEstimation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter distance in km");
		int km=s.nextInt();
		if(km<=0) {
			System.out.println("Invalid Input");
			return;
		}
		
		System.out.println("Enter the time to reach in hours");
		int time=s.nextInt();
		if(time<=0) {
			System.out.println("Invalid Input");
			return;
		}
		
		int sp= km/time;
		if(sp>30) {
			int in_sp=sp-30;
			System.out.println("You want to increase a speed "+in_sp+" km/hr from normal speed");
		}
		else {
			System.out.println("You drive a car at normal speed");
		}

	}

}
