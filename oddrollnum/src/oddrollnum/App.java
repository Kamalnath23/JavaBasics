package oddrollnum;

import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of studs: ");
		int n=sc.nextInt();
		
		int flag=0;
		int roll[]=new int[n];
		System.out.println("Enter rol num: ");
		for(int i=0;i<n;i++) {
			roll[i]=sc.nextInt();
			if (roll[i]%2!=0) {
				flag=1;
			}
		}
		
		if(flag == 0) {
			System.out.println("Even roll num ,no odd num");
			return;
		}
		
		String str=" ";
		for(int i=0;i<n;i++) {
		if (roll[i]%2!=0){
		
			str=str+roll[i];
		}
		}
		//System.out.println(str);
		
		for(int j=0;j<str.length();j++) {
			 {
				System.out.println(str.charAt(j));
			}
		}
		
		
		

	}

}
