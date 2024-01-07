package conversion;

public class ImplicitExplicitConversion {

	public static void main(String[] args) {
		// IMPLICIT CONVERSION
		char c='A';
		int i=c;
		System.out.println("without int " +i);
		
		int j=(int)c;
		System.out.println("with int " +j);
		
		
		//EXPLICIT CONVERSION
		long val=10;
		int x= (int) val;
		System.out.println(x);

	}

}
