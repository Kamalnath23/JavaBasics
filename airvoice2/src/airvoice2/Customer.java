package airvoice2;

public class Customer {
	private String customerName;
	private long contactNumber;
	private String emailid;
	private int age;
	
	//getters
	public String getCustomerName() {
		return customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public int getAge() {
		return age;
	}
	
	//setters
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public void setContactNumber(long conactNumber) {
		this.contactNumber=conactNumber;
	}
	public void setEmailid(String emailid) {
		this.emailid=emailid;
	}
	public void setAge(int age) {
		this.age=age;
	}

	//constructor
	public Customer() {
		this.customerName=customerName;
		this.contactNumber=contactNumber;
		this.emailid=emailid;
		this.age=age;


}
}
