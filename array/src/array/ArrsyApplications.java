package array;

import java.lang.*;
public class ArrsyApplications {

	public static void main(String[] args) {
		String [][] names= new String[3][3];
		names [0][0]="T"; 
		names[0][1]="o"; 
		names[0][2]="m";
		names[1][0]="R"; names[1][1]="a"; names[1][2]="m";
		names[2][0]=new String("S"); names[2][1]=new String("a"); names[2][2]=new String("m");
				
		for(int row=0;row<names.length;row++) {
			for(int col=0; col<names[row].length;col++) {
				System.out.print(names[row][col]);
			}
			System.out.println();
		}
		char[][] names1=new char[3][];
		names1[0]=new char[4];
		names1[1]=new char[3];
		names1[2]=new char[5];
		
		//System.out.println(names1[3][]);

	}

}
