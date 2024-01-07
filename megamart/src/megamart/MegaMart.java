package megamart;
import java.util.*;
public class MegaMart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer id");
		String cid = sc.next();
		
		String shop = cid.substring(0,4);
			//System.out.println("shop");
		if(!shop.equals("Mega")){
		System.out.println("Invalid Shop Name");
		Runtime.getRuntime().halt(0); //return;
		}
		
		
		String type = cid.substring(4,cid.length()-3);
		//System.out.println(type);
		if(!type.equals("Silver") && !type.equals("Gold") &&!type.equals("Platinum")){
		System.out.println("Invalid Customer Type");
		Runtime.getRuntime().halt(0);
		}
		int mid = Integer.parseInt(cid.substring(cid.length()-3,cid.length()));
		//System.out.println(mid);
		if(mid<=99 || mid>=1000){
		System.out.println("Invalid Member id");
		Runtime.getRuntime().halt(0);
		}
		System.out.println("Welcome Mega Mart "+type+" Customer");
	}

}
