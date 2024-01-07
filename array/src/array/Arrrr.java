package array;
import java.util.*;
public class Arrrr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("n");
		int n=sc.nextInt();
		System.out.println("ARRAY A");
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		
		System.out.println("ARRAY B");
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("TRUE OR FALSE: "+Arrays.equals(A, b));
		
		System.out.println("COPY CAT ");
		int c[]=Arrays.copyOf(A, n-1);
		for(int m:c) {
			System.out.print( m+" ");
		}
		System.out.println();
		System.out.println("SORT OF ARRAY A");
		Arrays.sort(A);
		for(int s:A) {
			System.out.print(s+ " ");
			
		}
		System.out.println("\nBinary Search");
		System.out.println(Arrays.binarySearch(A,6));
		
		
		
	}

}
