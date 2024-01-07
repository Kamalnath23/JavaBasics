package discountcoupon;

import java.util.*;

public class Main {

	public static void main(String[] args) {
			Product p=new Product();
			Category c= new Category();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id: ");
		int id=sc.nextInt();
		System.out.println("Enter the product name: ");
		String name=sc.next();
		System.out.println("Ener the price: ");
		double pric=sc.nextDouble();
		System.out.println("Enter category id: ");
		int id2=sc.nextInt();
		System.out.println("Enter the category name: ");
		String nm=sc.next();
		
		p.setProductId(id);
		p.setProductName(name);
		p.setPrice(pric);
		c.setCategoryId(id2);
		c.setCategoryName(nm);
		
		int ID=p.getProductId();
		String NAME=p.getProductName();
		double PRIC=p.getPrice();
		int ID2=c.getCategoryId();
		String NM=c.getCategoryName();
		
		p.setCategoryObj(c); //important
		
		p.applyCoupon();
		
		System.out.println("You need to pay "+String.format("%.2f", p.getPrice())+" for the "+NM+"-"+NAME+".");
		
	}

}
