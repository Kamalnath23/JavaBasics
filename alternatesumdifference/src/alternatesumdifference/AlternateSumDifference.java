package alternatesumdifference;
import java.util.*;
import java.lang.*;
public class AlternateSumDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		int sum=0;
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();		
		}
		
		for(int i=0;i<n/2;i++) {
			sum+=Math.abs(num[i]-num[n-1-i]);
		}
		System.out.println(sum);
	}

}
