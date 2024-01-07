package polymorph;

public class Car extends Vehicle {
	private int noofseats=4;
	
	public Car(int power, int noofseats) {
		super(power);
		this.noofseats= noofseats;
	}
	
	public int getSeats(){
		return noofseats;
	}
	public void setSeats(int noofseats){
		this.noofseats=noofseats;
	}
	
	public void display() {
		System.out.println("Car object");
		System.out.println("seats number "+noofseats);
	}
	
	

}
