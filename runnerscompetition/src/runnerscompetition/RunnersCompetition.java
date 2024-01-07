package runnerscompetition;
import java.util.*;
public class RunnersCompetition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of.runners : ");
		int n=sc.nextInt();
		
		//String temp="";
		String name[]=new String[n];
		float time[]=new float[n];
		
		for(int i=0;i<n;i++) {
			String temp=sc.next();
			String temparray[]=temp.split(",");
			name[i]=temparray[0];
			time[i]=Float.parseFloat(temparray[1]);
			if(time[i]>12 || time[i]<8) {
				System.out.println(time[i]+" invalid input");
				return;
				//Runtime.getRuntime().halt(0);
			}
			
		}
		
		int maxcount=0;
		float maxrep=0;
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(time[i]==time[j]) {
					count++;
				}
			}
			if(count>=maxcount) {
				maxcount=count;
				maxrep= time[i];
			}
			
		}
		System.out.println("max count is: " +maxcount);
		
		
		if(maxcount==n) {
			System.out.println(n+" (All) runners have same timing.");
		}
		else if(maxcount==0) {
			System.out.println("No runners wiith same time.");
		}
		else {
			for(int i=0;i<n;i++) {
				if(maxrep==time[i]) {
					System.out.println(name[i]);
				}
			}
		}

	}

}
