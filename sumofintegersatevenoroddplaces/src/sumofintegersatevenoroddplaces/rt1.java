package sumofintegersatevenoroddplaces;

import java.util.Scanner;

public class rt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("invalid Input.");
			return;
		}
		
		int sum=0;
		
		String str[]=new String[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		
		for(int i=0;i<n;i++) {
			String s=str[i];
			if(s.length()%2==0) {
				for(int j=1;j<s.length();j+=2) {
					sum=sum*Integer.parseInt(s.substring(j,j+1));
				}
			}
			else {
				for(int j=0;j<s.length();j+=2) {
					sum=sum*Integer.parseInt(s.substring(j,j+1));
				}
			}
			System.out.println("part sum "+ sum);
		}
		System.out.println("whole sum "+ sum);


	}

}
