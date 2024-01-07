package subclipertech;
import java.util.*;
public class SubstitutioCipherTechnique {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder();
		int e=7;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the encrypted text: ");
		String input=sc.nextLine();
		
		for(int i=0;i<input.length();i++) {
			char chr=input.charAt(i);
		
			if(chr ==' ') {
				sb.append(" ");
			}
			else if((chr>=0 && chr<=64) || (chr>=91 && chr<=96) || (chr>=123&&chr<=127)) {
				sb.append("");
			}
			else if (Character.isUpperCase(chr)) {
				char ch= (char)('A'+(chr-'A'-e+26)%26);
				sb.append(ch);	
			}
			else if(Character.isLowerCase(chr)) {
				char ch=(char)('a'+(chr-'a'-e+26)%26);
				sb.append(ch);
			}
		}
		
		if(sb.toString().isEmpty()) {
			System.out.println("No hidden Message.");
		}
		
		for(int j=0; j<sb.length();j++) {
			char chr1=sb.charAt(j);
			if((chr1>=65 && chr1<=90) || (chr1>=97 && chr1<122)){
				System.out.println("Decrypted Text: ");
				System.out.println(sb);
				return;
			}
			else {
				System.out.println("No hidden message");
				return;
			}
		}
	}

}
