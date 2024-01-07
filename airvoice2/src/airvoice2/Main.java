package airvoice2;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String nm=s.nextLine();
		System.out.println("Enter the ContactNumber:");
		long cn=s.nextLong();
		System.out.println("Enter the emailid:");
		String e=s.next();
		System.out.println("Age:");
		int a=s.nextInt();
		
		if(a<=0) {
			System.out.println("Invalid Input");
			return;
		}
		
		Customer obj=new Customer();
		
		obj.setCustomerName(nm);
		obj.setContactNumber(cn);
		obj.setEmailid(e);
		obj.setAge(a);
		
		String NAME= obj.getCustomerName();
		long CONTACT= obj.getContactNumber();
		String MAIL=obj.getEmailid();
		int AGE=obj.getAge();
		
		System.out.println("Name: "+NAME);
		System.out.println("ContactNumber: "+CONTACT);
		System.out.println("EmailId: "+MAIL);
		System.out.println("Age: "+AGE);
		


	}

}
