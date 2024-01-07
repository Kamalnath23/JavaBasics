package anagram2;
import java.util.*; 
public class AnagramHON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentenece 1 ");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		
		System.out.println("Enter sentenece 2 ");
		String s2=sc.nextLine();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length()) {
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println("Same");
			}
			else {
				System.out.println("different");
			}
			
		}
		else {
			System.out.println("Invalid");
			return;
		}

	}

}
