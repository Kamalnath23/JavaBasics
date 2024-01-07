package sudharshanquest;
import java.util.*;
public class SudharshanQuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int kid=0,ad1=0,ad2=0;
		
		System.out.println("Enter family members count");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("INVALID NUMBER");
		}
		
		
		int age[]=new int[n];
		System.out.println("Enter the age of "+n+" members");
		for(int i=0;i<n;i++) {
			age[i]=sc.nextInt();
			if(age[i]<0) {
				System.out.println("Invalid age");
				return;
			}
			}
		for(int i=0;i<n;i++) {
			if(age[i]>=1 && age[i]<=12) {
				kid++;
			}
			if(age[i]>=13 && age[i]<=18) {
				ad1++;
			}
			if(age[i]>=19) {
				ad2++;

			}
		}
		System.out.println(kid +" Kids");
		System.out.println(ad1+ " Adolescents");
		System.out.println(ad2+ " Adults");
}
}
