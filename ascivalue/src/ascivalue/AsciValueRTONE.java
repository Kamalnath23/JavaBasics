package ascivalue;

import java.util.*;

public class AsciValueRTONE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String sen[]=new String[3];
		for(int i=0;i<3;i++) {
			sen[i]=s.next();			
		}
		
		int sum=0;
		int b[]= new int[3];
		for(int i=0;i<3;i++) {
			sum=0;
			String str[]=sen[i].split("[^0-9]");
			for(int j=0;j<str.length;j++) {
				if(str[j].length()==1) {
					sum+=Integer.valueOf(str[j]);
					
				}
			}
			b[i]=sum;
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(b[i]);
		}

	}

}
