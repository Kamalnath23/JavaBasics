package harshadnumber;
import java.util.*;
public class HarshadNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid array size");
			return;
		}
		
		System.out.println("Enter array elements");
		int a[]=new int[n];
		int k=0; int flag=0;    //var declaration
		for(int i=0;i<n;i++) {
			k=sc.nextInt();
			if(k>9) {
				a[i]=k;
			}
			else {
				flag=1;
				System.out.println("provide "+k+ " is invalid.");
				break;
			}
		}
		
		if(flag!=1) {
			int x=0,y=0;
			for(int i=0;i<n;i++) {
				int sum=0;
				x=a[i];
				while(x>0) {
					y=x%10;
					sum=sum+y;
					x=x/10;
				}
				
				if(a[i]%sum==0) {
					System.out.println(a[i]+" is a harshad number");
				}
				else {
					System.out.println(a[i]+" is not a harshad number");
				}
			}
			
		}
		
	}

}
