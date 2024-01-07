package rt2practice;
import java.util.*;
public class MazeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the points of the first player:");
		int n=sc.nextInt();
		if(n<1000 || n>5000) {
			System.out.println("Invalid Input");
			return ;
		}
		
		System.out.println("Enter the string:");
		String s1=sc.next();
		//char c[]= s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='L' || ch=='R' || ch=='B' || ch=='F') {
				if(ch=='L' ) {
					n+=50;
				}
				else if(ch=='R' ) {
					n-=50;
				}
				else if(ch=='B' ) {
					n*=2;
				}
				else if(ch=='F' ) {
					n/=2;
				}
			}
			else {
				System.out.println("Invalid Input");
				return;
			}
		}
		
		
		
		
		System.out.println("Enter the points of the second player:");
		int m=sc.nextInt();
		if(m<1000 || m>5000) {
			System.out.println("Invalid Input");
			return;
		}
		System.out.println("Enter the string:");
		String s2=sc.next();
		
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			if(c=='L' || c=='R' || c=='B' || c=='F') {
				if(c=='L' ) {
					m+=50;
				}
				else if(c=='R' ) {
					m-=50;
				}
				else if(c=='B' ) {
					m*=2;
				}
				else if(c=='F' ) {
					m/=2;
				}
			}
			else {
				System.out.println("Invalid Input");
				return;
			}
		}
		
		if(s1.length()==s2.length()) {
			if(n>m) {
				System.out.println("Player 1 Wins");
			}
			else if(n<m) {
				System.out.println("Player 2 Wins");
			}
			else {
				System.out.println("Draw Nobody Wins");
			}
		}
		else {
			System.out.println("Invalid Input");
		}

	}

}
