package ucdc;


public class UpDownCasting {
	public static void main(String[] args) {
		Animal a= new Animal();
		Dog d=new Dog();
		
		a.walk();
		d.walk();
		d.sleep();
		
		
		//UPCASTING
		Dog d2= new Dog();
		Animal a2=  d2;
		a2.walk();
		// a2.sleep();  Unresolved compilation problem: 
														//The method sleep() is undefined for the type Animal
		
		
		//DOWNCASTING;
		Animal a3= new Dog();
		Dog d3= (Dog) a3;
		d3.walk();
		d3.sleep();
		
		//run time error
		//Animal a4= new Animal();
		//Dog d4= (Dog)a4;
		//d4.walk();
		//d4.sleep();
	}

}
