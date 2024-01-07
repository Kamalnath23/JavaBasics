package tutorial19;

class Thing {
	public final static int LUCKY_NUMBER = 24;
	
	public String name;
	public static String description;
	
	public static int count=0;
	
	
	
	public void showName() {
		System.out.println(description+ ": "+name);
	}
	
	public static void showInfo() {
		System.out.println("Hello!");
		System.out.println(description);
		//System.out.println(name);  won't work
	}
}


public class App {

	public static void main(String[] args) {
		
		Thing.description= "We are video creators";
		
		Thing.showInfo();
		
		Thing thing1= new Thing();
		Thing thing2= new Thing();
		
		thing1.name= "NitikaWilson";
		thing2.name="Kamalnath";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
		System.out.println(Thing.LUCKY_NUMBER-Math.PI);
	}

}
