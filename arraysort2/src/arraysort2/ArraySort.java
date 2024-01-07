package arraysort2;
import java.util.*;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		System.out.println("Enter array "+n+" elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Array created ");
		for(int z:a) {
			System.out.print(z+" ");
		}
		
		//removing duplicates
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
				}	
			}	
		 }
		
		//sort
		System.out.println();
		Arrays.sort(a);
		System.out.print("Sorted Arrated ");
		for(int m:a) {
			System.out.print(m+" ");
		}
		
		//max&min
		int max=0,min=0;
		
		for(int i=0;i<a.length;i++) {
			max=a[i];
			min=a[0];
		}
		System.out.println();
		System.out.println("Max is "+max);
		System.out.println("Min is "+min);
         
		int product= max*min;
		System.out.println("Product of min&max is "+product);
		
		}

}
