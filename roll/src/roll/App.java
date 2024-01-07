package roll;
import java.util.*;
public class App {
	public static void main(String[] args) {
		System.out.println("Enter the set of students");
		Scanner s=new Scanner(System.in);
		int setn=s.nextInt();
		if(setn<=0)
		{
		System.out.println(setn+" is an invalid size");
		return;
		}
		
		System.out.println("Enter the roll number");
		int[] rolls=new int[setn];
		int oddflag=0;
		
		
		for(int i=0;i<setn;i++){
		rolls[i]=s.nextInt();
		if(rolls[i]<0){
			System.out.println(rolls[i]+" is an invalid roll number");
			return;
			}
		if(rolls[i]%2!=0){
			oddflag=1;
			}
		}
		if(oddflag==0)
		{
		System.out.println("The "+setn+" numbers are not odd");
		return;
		}
		String str="";
		for(int i=0;i<setn;i++)
		{
		if(rolls[i]%2!=0)
		{
		str=str+rolls[i];
		}
		}
		for(int n=0;n<str.length();n++)
		{
		System.out.println(str.charAt(n)+" ");
		}

	}

}
