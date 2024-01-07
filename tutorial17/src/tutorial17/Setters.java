package tutorial17;

class Frog
{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class Setters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1= new Frog();
		Frog frog2=new Frog();
			//frog1.name="Bertie";
			//frog1.age=1;
			
			frog1.setName("Bertie");
			frog1.setAge(1);
			
			System.out.println(frog1.getName());
			System.out.println(frog1.getAge());
			
			
			frog2.setName("Rall");
			frog2.setAge(21);
			System.out.println("Name: "+frog2.getName()+" and age is "+frog2.getAge());
		
	}

}
