package polymorph;

public class DownCastRoad {
	public void displayDetails(Vehicle v) {
		if(v instanceof Car) {
			Car c= (Car) v;
			System.out.println("No of Seats: "+c.getSeats());
		}
		else if(v instanceof Car) {
			Truck t= (Truck) v; 
			System.out.println("Max load is " +t.getLoad());
		}
	}

}
