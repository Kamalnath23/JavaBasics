package tutorial14;

class Person {
	// instance variables (data or "state")

	String name;
	int age;

	// classes can contain

	// 1.data
	// 2. subroutine (methods)
	void speak() {
		for (int i = 0; i < 2; i++) {
			System.out.println("My name is: " + name + " and I am " + age + " years old");
		}
	}
	
	void sayHello() {
		System.out.println("Hello there");
	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.name = "Nitika Wilson";
		person1.age = 18;
		person1.speak();
		person1.sayHello();

		Person person2 = new Person();
		person2.name = "Reena Wilson";
		person2.age = 43;
		person2.speak();
		person2.sayHello();

		System.out.println(person1.name + " is a daughter of " + person2.name);

	}

}
