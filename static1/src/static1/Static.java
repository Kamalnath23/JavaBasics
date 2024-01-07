package static1;

import java.util.*;
public class Static {
	
	private static final int i=7;
	public static int id2=8;
	protected static int id3=9;
	private String name;
	
	public Static(String name) {
		System.out.println("In constructor");
		this.name=name;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		
		System.out.println(i);
		System.out.println(id2);
		System.out.println(id3);
		
		Static obj=new Static("kamal");
		
		int id2=4;
		System.out.println(id2);
		
		double m=Math.sqrt(100);
		System.out.println(String.format("%.2f", m));
	}
	

}
