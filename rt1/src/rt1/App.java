package rt1;
import java.util.*;
public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if( n<0) {
			System.out.println("Invalid number");
			return;
		}
		
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<10) {
				System.out.println("Invalid. print "+arr[i]+" greater than 10");
			}
		
		}

		for(int i=0;i<n;i++) {
			if(arr[i]<99) {
			if(i%2==0) {
				int e=0,c=0;
				c=arr[i];
				
				while(c>0) {
					c=c/10;
					e=c*c;
					System.out.println(e);
					c=0; e=0;
					
				}
				
				
				
			}
			
			else if(i%2!=0) {
				int f=0,d=0;
				d=arr[i];
				
				
				while(d!=0) {
					
					d=d%10;
					
					f=d*d;
					System.out.println(f);
					d=0; f=0;
				}
				
				
			}
		  }	
			
			else if(arr[i]>99) {
				int length=(int) (Math.log10(arr[i])+1);
				System.out.println("length:" +length);
				if(length%2!=0) {
					int x=0;
					int y=0;
					int u=0; 
					String v="";
				if(i%2==0) {
					u=arr[i];
					//v=Integer.toString(u);
					for(int j=0;j<length;j++) {
						
						while(u>0) {
							x=u/100;
							y+=(x*x);
							System.out.println(y);
							x=0; y=0;
						}
						
					}
				}
			}
			}
		}
		
		
	}

}
