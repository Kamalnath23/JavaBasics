package mockmcq;

class Employee { 
	 public Employee(){
	  System.out.print(" 0 ");
	 }
	 public Employee(int n){
	  System.out.print(" " + n + " ");
	 }
	}

	class ProjectManager extends Employee{
	 public ProjectManager(){
	  System.out.print(" 1 ");
	 }
	 public ProjectManager(int n){
	  System.out.print(" " + n + " ");
	 }
	}

public class ApplicationTester {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new ProjectManager(999);
		Employee emp2 = new Employee(999);
	}

}
