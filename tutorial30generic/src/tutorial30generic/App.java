package tutorial30generic;

import java.util.ArrayList;


class Animal{
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////before java5//////
		ArrayList list= new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruits = (String)list.get(1);
		System.out.println(fruits);
		
		
		////// java 5-- generics introduced Modernstyle /////
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("rabbit");
		
		String animal= strings.get(1);
		System.out.println(animal);
		
		//parametrized classes more than 1 argument////
		
		//HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		//java7 style//
		
		ArrayList<Animal> somelist= new ArrayList<>();
		
		
		
		

	}

}
