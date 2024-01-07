package tutorial10;
import java.util.*;
public class Application {
public static void main(String[] args) {
	
	int value=7;
	int values [];
	values= new int[3];
	values[0]=5;
	values[1]=4;
	values[2]=7;
	System.out.println(values[0]);
	System.out.println(values[1]);
	System.out.println(values[2]);
	
	for(int i=0; i<values.length; i++)
	{
		System.out.println(values[i]);
	}
	
	int[] numbers= {5,7,9,11,13,15};
	for(int i=0; i<numbers.length; i++)
	{
		System.out.println(numbers[i]);
	}
	
	for(int m:numbers)
	{
		System.out.println(m);
	}
}
}
