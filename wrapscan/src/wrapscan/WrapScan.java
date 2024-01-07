package wrapscan;

import java.util.*;
public class WrapScan {

	public static void main(String[] args) {
		int a=10;
		double bd=10.737;
		
		Integer obj= new Integer(a); //wrapping
		Double obj2= new Double(bd);
		
		int b=obj.intValue();  //unwrapping
		double f=obj2.doubleValue();		
		int c=b-a;
		int z=obj-a;
		
		System.out.println(obj);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(z);
		
		System.out.println(String.format("%.2f", f));
		
		// auto boxing and un-boxing
		
		Integer i=10;
		int g=i;

		System.out.println(g+"+"+i+"="+(g+i));
		
		System.out.println(g+f);
		
		//type casting
		Integer num= new Integer(4);
		float ft= num.floatValue();
		System.out.println("type casting: int to float "+ft);
		
		Double db= new Double(8.2);
		int l= db.intValue();
		System.out.println("type casting db to int "+l);
		
		//prior to java 5
		
		Integer y=new Integer(567);
		int x=y.intValue();
		x++;     System.out.println(x);
		y=new Integer(x);	System.out.println(y);
	}

}
