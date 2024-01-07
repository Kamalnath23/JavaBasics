package omr;
import java.util.*;
public class Omr {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i;
	System.out.println("Enter the No of questions");
	int a=sc.nextInt();
	if(a<0)
	{
	System.out.println("Invalid Number");
	return;
	}
	int count=0;
	int mark=0;
	char b[]=new char[a];
	System.out.println("Enter the answer key");
	for (i=0;i<a;i++) {
	b[i] = sc.next().charAt(0);
	if ((b[i] >= 'a' && b[i] <= 'e')||(b[i] > 'E')) {
	System.out.println("Invalid Answers");
	return;
	}
	}
	char c[]=new char[a];
	System.out.println("Enter the student answers");
	for (i=0;i<a;i++)
	{
	c[i]=sc.next().charAt(0);
	if ((c[i] >= 'a' && c[i] <= 'e')||(b[i]>'E')) {
	System.out.println("Invalid Answers");
	return;
	}
	}
	for(i=0;i<a;i++)
	{
		if(b[i]==c[i])
			{
				count++;
			}
	}
	
	if(count>0)
	System.out.println("Correct answers are "+count);
	mark=(count*100)/a;
	if(count<1)
	System.out.println("All answers are wrong");
	System.out.println("Mark is "+mark);
	}
	}


