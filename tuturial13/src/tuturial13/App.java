package tuturial13;
import java.lang.*;
class Person
{
	// instance variables (data or "state")
	
	String name;
	int age;
	
	// classes can contain 
	
	// 1.data
	//2. subroutine (methods)
	

}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.name= "Nitika Wilson";
		person1.age= 17;
		
		Person person2= new Person();
		person2.name= "Reena Wilson";
		person2.age= 43;
		
		System.out.println(person1.name);
		
	}

}
