package tutorial11;

import java.util.*;

public class App {

	public static void main(String[] args) {

		String names[] = new String[3];
		names[0] = new String("mini");
		names[1] = new String("teena");
		names[2] = "tom";
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		String[] fruits = { "apple", "banana", "mango", "orange", "kiwi" };
		for (String f : fruits) {
			System.out.println(f);
		}
		String text=null;
		System.out.println(text);
		
		String texts[]= new String[2];
		texts[0]= "one";
		System.out.println(texts[0]);
	}
}
