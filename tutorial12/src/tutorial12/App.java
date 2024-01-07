package tutorial12;
import java.util.*;



public class App {
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int values[] = { 3, 5, 200 };
		System.out.println(values[2]);

		int[][] grid = { { 3, 6, 1 }, { 2, 4 }, { 5, 7, 8, 9 } };
		System.out.println(grid[1][1]);
		System.out.println(grid[0][1]);

		String[][] text = new String[2][3];
		text[0][1] = "hello";
		System.out.println(text[0][1]);

		for(int row=0; row<grid.length; row++)
		{
			for(int col=0; col < grid[row].length; col++)
			{
				System.out.print(grid[row][col] +"\t");
			}
			System.out.println();
		}
		System.out.println("JAGGED ARRAY");
		
		String[][] words= new String[2][];
		
		System.out.println(words[0]);
		words[0]= new String[3];
		words[0][1]= "hi there";
		
		System.out.println(words[0][1]);
		
		
		//ARRAY OF OBJECT
		App empList[]=new App[3];
		//empList[0]=new App();
		//empList[1]=new App();
		//empList[2]=new App();
		
		for(int i=0;i<empList.length;i++) {
			System.out.println("Enter id: ");
			int id=sc.nextInt();
			System.out.println("Enter the name: ");
			String name=sc.next();
			empList[i]=new App(id,name);  //object creation
		}
		
		for(int i=0;i<empList.length;i++) {
			System.out.println("S.NO "+i);
			System.out.println("ID is "+empList[i]+" "+"Name is "+empList[i]);
		}
	
	}

	public App(int id, String name) { //constructor
		
		// TODO Auto-generated constructor stub
		 int eid;
		String ename;
	}
	

}
