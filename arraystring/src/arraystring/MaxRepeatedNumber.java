package arraystring;
import java.util.Scanner;
public class MaxRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0,count=0,tmpcount=0,size;
		  Scanner sc=new Scanner(System.in);
		  size=sc.nextInt();
		  if(size<=0)
		  {
		  System.exit(0);
		  }
		  
		 int[]a=new int[size];
		  for(int i=0;i<size;i++)
		  {
		  a[i]=sc.nextInt();
		  sc.nextLine();
		  }
		  
		  
		  for(int i=0;i<size;i++)
		  {
		  for(int j=0;j<size;j++)
		  {
		  if(a[i]==a[j])
		  {
		  tmpcount++;
		  }
		  System.out.println("Tempcount is: "+tmpcount);
		  }
		  
		  if(tmpcount>=count)
		  {
		  if(a[i]<max && tmpcount==count)
		  {
		  count=tmpcount;
		  System.out.println("real count" +count);
		  System.out.println(max);
		  }
		  else
		  {
		  max=a[i];
		  count=tmpcount;
		  System.out.println("real count2 "+count);
		  System.out.println(max);
		 }
		  }
		  tmpcount=0;
		  }
		  System.out.println(max);


	}

}
