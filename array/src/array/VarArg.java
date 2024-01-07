package array;

public class VarArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The sum is"+ sum(10,20,30));

	}
	
	public int sum(double numbers) {
		int total=0;
		for(int i=0;i<numbers.length;i++) 
			total+=numbers[i];
			return total;
		
	}

}
