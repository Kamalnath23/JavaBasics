package amshiniquest;
import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num=s.next();
		int l=num.length();
		
		String temp="";
		int n[]=new int[l];
		
		for(int i=0;i<l;i++) {
			temp=s.next();
			
			String temparr[]=temp.split("");
			n[i]=Integer.parseInt(temparr[1]);
		}
	
		

	}

}
