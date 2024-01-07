package sumofsquareofodd;
import java.util.*;
public class Appp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of values");
		 int n=sc.nextInt();
		 if(n<=0)
		 {
		 System.out.println(n+" is an invalid size");
		 return;
		 }
		 int a[]=new int[n];
		 int count=0;
		 int sum=0;
		 System.out.println("Enter the values");
		 for(int i=0;i<n;i++)
		 {
		 a[i]=sc.nextInt();
		 if(a[i]%2!=0)
		 count=count+1;
		 }
		 //System.out.println(count);
		 
		 if(count<=0)
		 {
		 System.out.println("These "+n+" values are not a odd digit");
		 return;
		 }
		 else
		 {
		 for(int i=0;i<n;i++)
		 {
		 if(a[i]%2!=0)
		 {
		 sum=sum+a[i]*a[i];
		 }
		 }
		 System.out.println(sum);
		 }


	}

}
