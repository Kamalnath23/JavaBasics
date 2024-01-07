package polymorph;

public class Road {
	public void ride(Vehicle v) {
		if(v instanceof Car) {
			System.out.println("Car is on ride");
		}
		else if(v instanceof Truck) {
			System.out.println("Truck is on ride");
		}
		else {
			System.out.println("vehicle object in ride");
		}
	}
	
	//DOWNCASTIG
	
	public void display_details(Vehicle v) {
		if(v instanceof Car) {
			Car c= (Car) v;
			System.out.println("No of seats"+c.getSeats());
		}
		else if(v instanceof Truck) {
			Truck t= (Truck) v;
			System.out.println("Max Load"+t.getLoad());
		}
	}

}
