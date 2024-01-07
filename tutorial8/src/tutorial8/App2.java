package tutorial8;
import java.util.*;
public class App2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int value=0;
		do {
			System.out.println("Enter the number: ");
			value= sc.nextInt();		
			}
		while (value != 5);
		System.out.println("got 5!");
	}

}
