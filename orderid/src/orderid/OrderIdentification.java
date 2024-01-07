package orderid;
import java.util.*;
public class OrderIdentification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter an array size");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid I/p");
			return;
		}
		
		int a[]= new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int b[]=Arrays.copyOf(a, a.length);
		
		if(Arrays.equals(a, b)) {
			count++;
		}
		if(count>0) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
				//return;
			}
			System.out.print("are print in ascending order");
		}
		else {
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println("They are not in ascending order.");
		}

	}

}
