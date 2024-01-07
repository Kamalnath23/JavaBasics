package array;

import java.util.Arrays;

public class ArrayApp2 {
	public static void main(String[] args) {
		int []a= {2,4,6,8,10};
		int []b= {2,4,6,8,10};
		
		System.out.println(Arrays.equals(a, b));
		
		int [] num1= {1,3,5,7,9};
		int [] num2= Arrays.copyOf(num1, 3);
		for(int n:num2)
		System.out.println(n);
		
		System.out.println();
		int[]num3= {12,41,32,16,10};
		Arrays.sort(num3);
		for(int n3:num3) {
			System.out.print(n3+" ");
		}
		
		System.out.println("\n");
		
		int[]num5= {82,41,32,16,10,46,41,89};
		Arrays.sort(num5);
		for(int n5:num5) {
			System.out.print(n5+" ");
		}
		System.out.println("\n"+Arrays.binarySearch(num5,41));
		
		
	}

}
