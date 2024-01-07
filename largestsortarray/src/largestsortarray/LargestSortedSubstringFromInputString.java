package largestsortarray;
import java.util.*;
public class LargestSortedSubstringFromInputString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter STRING");
		String s=sc.next();
		
		int length=0, firstindex=0, lastindex=0;
		
		for(int i=0;i<s.length();i++) {
			int ascii=(int) s.charAt(i);
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(j)==++ascii) {
					count++;
					continue;
				}
				else {
					if(count>length) {
						firstindex=i;
						lastindex=j;
						length=count;
						break;
					}
				}
			}
			System.out.println(s.substring(firstindex,lastindex));
		}
		
	

	}

}
