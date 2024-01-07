package tutorial9;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter some text: ");
		String text = sc.nextLine();

		switch (text) {
		case "start":
			System.out.println("machine started");
			break;
		case "end":
			System.out.println("Machine stopped");
			break;

		default:
			System.out.println("Command not recoganized");
		}

	}

}
