package ascivalue;
import java.util.*;
import java.util.regex.Pattern;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of.Sentence");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("The number of sentences is invalid. ");
			return;
		}
		
		System.out.println("Enter the sentence");
		String sentence[]= new String[n];
		for(int i=0;i<n;i++) {
			sentence[i]=sc.next();
		
		}
		
		int sum=0;
		int b[]= new int[n];
		for(int i=0;i<n;i++) {
			sum=0;
			String str[]=sentence[i].split("[^0-9]");
			for(int j=0;j<str.length;j++) {
				if(str[j].length()==1) {
					sum+=Integer.valueOf(str[j]);
					
				}
			}
			b[i]=sum;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		
		
		
	}

}
