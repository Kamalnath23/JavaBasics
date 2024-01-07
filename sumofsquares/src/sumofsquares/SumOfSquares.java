package sumofsquares;
import java.util.*;
public class SumOfSquares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of values: ");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid ip");
			return;
		}
		
		int count=0;
		int sum=0;
		
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				sum=sum+a[i]*a[i];
				count=count+1;
			}
		}
		if(count>1) {
		System.out.println(sum); }
		
		if(count<=0) {
			System.out.println("no odd num");
		}
		
		

	}

}
