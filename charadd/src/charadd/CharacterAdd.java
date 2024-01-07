package charadd;
import java.util.*;
public class CharacterAdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of sentence: ");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid Input");
			return;
		}
		
		System.out.println("Enter the sentences: ");
		String Str[]=new String[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			Str[i]=sc.next();
		}
		
		for(int i=0;i<Str.length;i++) {
			String s=Str[i].replaceAll("[0-9]","");
			//System.out.println(s);
			for(int j=0;j<s.length();j++) {
				char c=s.charAt(j);
				int ascii=c;   //System.out.println("VALUE "+ascii);
				 
				sum=sum+ascii;
			}
			System.out.println(sum);
			sum=0;
		}
		
		
		

	}

}
