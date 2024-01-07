package tutorial19;

class Thingy {
	public static int count = 0;
	
	public int id;
	
	public String name;
	public static String description;

	public Thingy() {
		
		id = count;
		count++;
	}

	public void showName() {
		System.out.println("Object ID "+ id+ ". " +description + ": " + name);
	}

	public static void showInfo() {
		System.out.println("Hello!");
		System.out.println(description);
		// System.out.println(name); won't work
	}
}

public class App2 {
	public static void main(String[] args) {
		Thingy.description = "We are video creators";

		Thingy.showInfo();

		System.out.println("Before creating object count is: " + Thingy.count);

		Thingy thing1 = new Thingy();
		Thingy thing2 = new Thingy();

		System.out.println("After creating object count is: " + Thingy.count);

		thing1.name = "NitikaWilson";
		thing2.name = "Kamalnath";

		thing1.showName();
		thing2.showName();
	}

}
