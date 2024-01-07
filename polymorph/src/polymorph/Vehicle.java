package polymorph;

public class Vehicle {
private int power; //attribute declaration
	
	public Vehicle (int power) { //constructor
		this.power=power;
	}
	
	public int getPower() { //getters
		return power;
	}
	
	public void setPower(int power) { //setters
		this.power=power;
	}
	
	public void display() {
		System.out.println("Vehicle object");
	}
	
	//down
	
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
