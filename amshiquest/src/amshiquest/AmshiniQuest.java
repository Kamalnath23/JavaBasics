package amshiquest;
import java.util.*;
public class AmshiniQuest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a number");
		String s=sc.next();
		int l=s.length();
		
		int n[]=new int[l];
		int n2[]=new int[l];
		for(int i=0;i<l;i++) {
			String str[]=s.split("");
			n[i]=Integer.parseInt(str[i]);
			if(n[i]%11==0) {
				count++;
			}
			System.out.println(count);
			String str2[]=s.split(" ");
			n2[i]=Integer.parseInt(str[i]);
			System.out.print(n2[i]+" ");
			if(n[i]%11==0) {
				count++;
			}
			System.out.println(count);
		}
		

	}

}
