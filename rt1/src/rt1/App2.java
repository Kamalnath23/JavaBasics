package rt1;
import java.util.*;
public class App2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("INVALID "+n);
			return;
		}
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]<10) {
				System.out.println("number should be more than 10.");
				return;
			}
		}
		
		for(int i=0;i<n;i++) {
			int sum=0;
			if(i%2!=0) {
				if((a[i]%10)%2==1) {
					sum+=(a[i]%10)*(a[i]%10);
				}
				else if((a[i]/10)%2==1) {
					sum+=(a[i]/10)*(a[i]/10);
				}
				System.out.println(sum);

			}
			
			else if(i%2==0) {
				if((a[i]%10)%2==0) {
					sum+=(a[i]%10)*(a[i]%10);
				}
				else if((a[i]/10)%2==0) {
					sum+=(a[i]/10)*(a[i]/10);
				}
				System.out.println(sum);
			}
		}
		
	}

}
