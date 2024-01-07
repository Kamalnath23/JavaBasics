package countofoccofsubstring;
import java.util.*;
import java.util.regex.*;
public class CountOfOccurenceOfSubStringInAstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the string:");
		String str=sc.next();
		if(Pattern.matches("[a-z]+", str)){
			System.out.println("Enter pattern:");
			String pat=sc.next();
			if(Pattern.matches("[a-z]+", pat)){
				Pattern p=Pattern.compile(pat);
				Matcher m=p.matcher(str);
				while(m.find()){
					count++;
				}
				System.out.println("Count is: "+count);
			}
			else
			{
				System.out.println("Invalid Pattern");
			}
		}
		else
		{
		System.out.println("Invalid String");
		}

	}

}
