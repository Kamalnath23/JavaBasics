package prodofmaxmin;
import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0,max=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the arrays" );
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			min=arr[0];
			max=arr[(arr.length)-1];
		}
		
		int product=min*max;
		System.out.println(product);
		

	}

}
