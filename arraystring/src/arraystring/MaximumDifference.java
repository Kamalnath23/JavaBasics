package arraystring;

import java.util.*;
public class MaximumDifference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		  int num=sc.nextInt();
		 if(num<=0)
		  {
		  System.out.println("Invalid");
		  return;
		  }
		 
		  int input[]= new int [num]; //array decl
		  for(int i=0;i<num;i++)
		  {
		  input[i]=sc.nextInt();
		  sc.nextLine();
		  }
		  for(int i:input)
		  if(i<0)
		  {
		  System.out.println("Invalid");
		  return;
		  }
		  
		  int diff[][]= new int[num][num]; //2d array
		  for(int i=0;i<num;i++)
		  {
		  for(int j=0;j<num;j++)
		  {
		  diff[i][j]=Math.abs(input[i]-input[j]); 
		  System.out.println("Difference "+ diff[i][j]);
		  }
		  }
		  
		  int max= Integer.MIN_VALUE; //max decl
		  System.out.println("max :"+max);//check
		  
		  for(int i=0;i<num;i++)
		  {
		  for(int j=0;j<num;j++)
		  {
		  if(diff[i][j]>max)
		  max=diff[i][j];
		  }
		  }
		  System.out.println("new max is "+max);
		 
		  
		  for(int i=0;i<num;i++)
		  {
		  for(int j=0;j<num;j++)
		  {
			  //System.out.println(diff[i][j]);
		  if(diff[i][j]==max)
		  {
		  System.out.println("("+(i)+","+(j)+")");
		  return;
		  }
		  }
		  }

	}

}
