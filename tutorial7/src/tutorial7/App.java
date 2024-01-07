package tutorial7;
import java.util.*;
public class App {

	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in) ;
		//Output the prompt
		System.out.println("Enter a line of Text: ");
		//Wait for the user to enter the line of text
		String line = input.nextLine();
		// tell them what they entered
		System.out.println("You entered: " +line);

		System.out.println("Enter a floating point value:");
		double value= input.nextDouble();
		System.out.println("floating point is: "+value );
	}

}
// for int use nextInt() . that is: int value= input.nextInt();
//eg2: double value= input.nextDouble();