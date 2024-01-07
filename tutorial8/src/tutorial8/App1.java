package tutorial8;
import java.util.*;
public class App1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int value= sc.nextInt();
		
		while(value != 5)
		{
			System.out.println("Enter a number: ");
			value=sc.nextInt();
		}
       System.out.println("got 5!");
	}

}
