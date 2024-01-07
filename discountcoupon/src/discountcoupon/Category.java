package discountcoupon;
import java.lang.*;
public class Category {
	private int categoryId;
	private String categoryName;
	
	//getters
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	
	
	//setters
	public void setCategoryId(int categoryId) {
		this.categoryId=categoryId;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName=categoryName;
	}
	
	public Category() { //constructor
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	}

}
