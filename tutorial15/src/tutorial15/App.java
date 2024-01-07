package tutorial15;

class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: "+name );
	}
	
	int calculateYearstoRetirement() {
		int yearsLeft= 65 - age;
		System.out.println("check :"+yearsLeft);
		return yearsLeft;
	}
	
	int getAge()
	{
		return age;
	}
	
	String getName() {
		return name;
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1= new Person();
		
		person1.name="Rezi";
		person1.age=20;
		person1.speak();
		
		int years = person1.calculateYearstoRetirement();
		System.out.println("Years till retirements "+years );
		
		int age=person1.getAge();
		
		String name=person1.getName();
		System.out.println("Name is "+name); 
		System.out.println("I'm "+age+ " years old.");
	}

}
