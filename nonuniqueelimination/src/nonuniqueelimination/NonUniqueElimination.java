package nonuniqueelimination;
import java.util.*;
public class NonUniqueElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine(),abc="";
		int count=0;
		for(int i=0;i<name.length();i++){
			for(int j=1;j<name.length()-1;j++){
				if(name.charAt(i)==name.charAt(j)){
						name=name.replace(String.valueOf(name.charAt(j)),""); //*
						count+=1;
				}
			}
		}
		
		if(count==0) {
		System.out.println("All are unique character");
		return;
		}
		else {
		System.out.println(name);

	}

}
}
