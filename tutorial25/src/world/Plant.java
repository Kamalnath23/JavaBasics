package world;

public class Plant {
	
	//BAD PRACTICE
	public String name;
	 //ACCEPTABLE PRACTICE ---- its FINAL
	public final static int ID=3; 
	
	private String type;
	
	
	protected static String size; //unable to access without static
	
	int height;
	
	
	public Plant() {
		this.name="I am groot";
		
		this.type="Plant";
		
		this.size="Medium";
		
		this.height= 8;
	}

}
