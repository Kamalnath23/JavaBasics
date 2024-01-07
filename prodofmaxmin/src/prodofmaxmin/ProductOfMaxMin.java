package prodofmaxmin;

import java.util.*;
public class ProductOfMaxMin {
//wrong
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Array: ");
		int n=sc.nextInt();
		
		int min_temp =Integer.MIN_VALUE;
		int max_temp =Integer.MAX_VALUE;
		
		int min=0,max=0;
		int arr[]=new int[n];
		System.out.println("Enter the arrays" );
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		for (int i=0;i<n;i++) {
			if(arr[i]> 0 && arr[i]<max_temp) {
				max=arr[i];
			
			}
			
		}
		//System.out.println(max);
		
		for(int i=0;i<n;i++) {
			if(arr[i]<max) {
				min=arr[i];
			}
		}
		//System.out.println(min);
		
		int product=max*min;
		System.out.println(product);
		

	}

}
