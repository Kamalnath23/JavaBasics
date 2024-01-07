package tutorial22;

public class Car extends Machine {
	
	public void start() {
		System.out.println("Car Started");
	}
	
	public void WipeWindShied() {
		System.out.println("Wiping windshield");
	}

	public void showInfo() {
		System.out.println("Car name:"+ name);
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car Stopped");
	}
	
	
}
