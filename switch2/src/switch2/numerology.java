package switch2;
import java.util.*;
import java.util.regex.Pattern;
public class numerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String n=s.nextLine();
		
		if(!Pattern.matches("[A-Za-z]+", n)) {
			System.out.println("Invalid Input");
			return;
		}
		int sum=0;
		char b[]=n.toCharArray();
		
		for(int i=0;i<b.length;i++) {
			switch(b[i]) {
			case 'a':
				sum=sum+1;
				break;
			case 'A':
				sum=sum+1;
				break;
			case 'B':
				sum=sum+2;
				break;
			case 'b':
				sum=sum+2;
				break;
			case 'c':
				sum=sum+3;
				break;
			case 'd':
				sum=sum+4;
				break;
			case 'C':
				sum=sum+3;
				break;
			case 'D':
				sum=sum+4;
				break;
			case 'K':
				sum+=11;
				break;
			case 'k':
				sum=sum+11;
				break;
			case 'm':
				sum+=13;
				break;
			case 'l'  :
				sum+=12;
				break;
			case 'L':
				sum+=12;
				
			}
			
		}
		System.out.println(sum);
		
		if(sum%2==0 && sum%3==0) {
			System.out.println("numerological num");
		}
		else {
			System.out.println("non numeroligical num");
		}

	}

}
