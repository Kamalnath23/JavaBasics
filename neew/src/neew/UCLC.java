package neew;
import java.util.*;
import java.util.regex.Pattern;
public class UCLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int uc=0,lc=0;
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		if(Pattern.matches("[a-zA-Z]+", s) & s.length()<10) {
			for(int i=0;i<s.length();i++) {
				if(Character.isUpperCase(s.charAt(i))) {
					uc++;
				}
				else if(Character.isLowerCase(s.charAt(i))) {
					lc++;
				}
			}
			
			System.out.println(uc+"-"+lc+"="+(uc-lc));  
			System.out.println(uc+"*"+lc);
		}
		else {
			System.out.println("Invalid String");
			return;
		}

	}

}
