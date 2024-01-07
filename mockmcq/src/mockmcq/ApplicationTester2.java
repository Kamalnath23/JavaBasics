package mockmcq;

class GrandParent 
{
 public void method()
 {
  System.out.println("1");
 }
 public void display()
 {
  System.out.println("Grand Parent");
 }
}

class Parent extends GrandParent
{
 public void display()
 {
  System.out.println("Parent");
 }
}

class Child extends Parent
{
 public void display()
 {
  System.out.println("Child");
 }
}

public class ApplicationTester2 {

	public static void main(String[] args) {
		GrandParent ref = new Child();
		  ref.display();
		  ref.method();  //Line-1
	}

}
