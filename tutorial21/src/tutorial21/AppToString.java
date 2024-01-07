package tutorial21;

class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	 public String toString() {
		 return String.format("%d: %s", id, name);
		 /*
		   StringBuilder sb= new StringBuilder();
		  
		 sb.append(id)
		 .append(": ")
		 .append(name);
		 return sb.toString(); */
		//return id+": "+name; - inefficient//
	 }
	
	
}



public class AppToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1=new Frog(6,"Shunmuga Saravana");
		Frog frog2=new Frog(2,"Kamalnath");
		
				System.out.println(frog1);
				System.out.println(frog2);
	}

}
