package tutorial24;

public class Machine implements Info {
	
	private int id=7;
	
	public void start() {
		System.out.println("Machine Started");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine ID is: "+id);
		
		
	}

}
