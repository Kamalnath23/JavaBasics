package tutorial27encapsulationApi;

class Plant{
	public static final int ID=7;
	private String name;
	
	public String getData() {
		String data="some stuff "+ calculateGrowthForecast();
		
		return data;
	}
	
	private int calculateGrowthForecast() { // encapsulation
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class App {
	public static void main(String[] args) {
		//System.out.println("Enter your name "+ ".");
		//System.out.println(data);
		//System.out.println(calculateGrowthForecast());
		
	}

}
