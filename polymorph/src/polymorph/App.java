package polymorph;
import java.util.*;

	public class App {
	public static void main(String[] args) {
		//upcASTING
		Vehicle v1= new Vehicle(100);
		Vehicle v2= new Car(100,4);
		Vehicle v3= new Truck(200,1000);
		Vehicle v4= new Vehicle(120);
		
		v1.display();
		v2.display();
		v3.display();
		v4.display();
		
		Road r= new Road();
			r.ride(v1);
			r.ride(v2);
			r.ride(v3);
			
		
			
		

	}

}
