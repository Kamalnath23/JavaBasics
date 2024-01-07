package learn;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternMatcher {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pattern p=Pattern.compile("s");
		Matcher m=p.matcher("bcs");
		boolean b= m.matches();
		System.out.println(b);
		
		Pattern p2=Pattern.compile("as");
		Matcher m2=p.matcher("as");
		boolean b2= m.matches();
		System.out.println(b2);
		

	}

}
