package printf;
import java.util.*;
public class printf_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
        	 String s1=sc.next();
        	 int x=sc.nextInt();
             
             int l1=s1.length();
             if(l1<=10 && x>=0 && x<=999){
                 System.out.printf("%-15s %03d\n",s1,x);
                 continue;
             }
             else{
                 
             }
         }
         System.out.println("================================");
	}

}
