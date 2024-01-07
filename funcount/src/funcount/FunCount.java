package funcount;
import java.util.*;
public class FunCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of toys:");
		 int n=sc.nextInt();
		 if(n<=0)
		 {
		 System.out.println("Invalid Input");
		 }
		 else if(n>15)
		 {
		 System.out.println("Number exceeds the limit");
		 }
		 
		 else{
		 String[] a=new String[n];
		 System.out.println("Enter the toy list");
		 for(int i=0;i<n;i++){
			 a[i]=sc.next().toLowerCase();
		 }
		 Arrays.sort(a);
		 int count=0;
		 
		 for(int i=0;i<n;i++){
			 count=1;
			 for(int j=i+1;j<n;j++){
				 	if(a[i].equalsIgnoreCase(a[j])){
				 		count++;
		 				a[j]="0";
				 	}
			 }
			 if((a[i])!="0"){
				 System.out.println(a[i]+"="+count);
			 }


	

		 }
		 }
}
}