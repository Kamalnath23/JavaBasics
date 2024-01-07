package middleletter;
import java.util.*;
import java.util.regex.Pattern;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=s.nextLine();
		if(!Pattern.matches("[A-Za-z]+", str)) {
			System.out.println("Invalid input");
			return;
		}
		else if(str.length()<2) {
			System.out.println("Invalid length");
			return;
		}
		
		
		int len=str.length();
		if(len%2==0) {
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			System.out.println(sb.toString());
		}
		else if(len%2!=0) {
			int mid=len/2;
			System.out.println("mid is "+mid);
			String substr= str.substring(0, mid);
			String remsubstr=str.substring(mid, len);
			
			StringBuilder sb=new StringBuilder(substr);
			sb.reverse();
			System.out.println(sb.toString()+remsubstr);
		}
	}

}
