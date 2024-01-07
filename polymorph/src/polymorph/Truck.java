package polymorph;

public class Truck extends Vehicle{
	private float load;
	
	public Truck(int power, float load) {
		super(power);
		this.load=load;
	}
	
	public float getLoad() {
		return load;
	}
	
	public void setLoad(float load) {
		this.load=load;
	}
	
	public void display() {
		System.out.println("Truck object");
		System.out.println("load "+load);
	}

}
