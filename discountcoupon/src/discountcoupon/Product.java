package discountcoupon;
import java.lang.*;
public class Product {
	private int productId;
	private String productName;
	private double price;
	private Category categoryObj= new Category();
	
	//getters
	public int getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Category getCategoryObj() {
		return categoryObj;
	}
	
	
	//setters
	public void setProductId(int productId) {
		this.productId=productId;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setCategoryObj(Category categoryObj) {
		this.categoryObj=categoryObj;
	}
	
	
	//constructor
	public Product() {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.categoryObj=categoryObj;
	}
	
	
	public void applyCoupon() {
		if(categoryObj.getCategoryName().equals("Electronic")) {
			setPrice(price*0.90);
		}
		else if(categoryObj.getCategoryName().equals("Furniture")) {
			price=price*0.95;
		}
		else if(categoryObj.getCategoryName().equals("Cosmetics")) {
			setPrice(price*0.98);
		}
		else {
			price=price-1;
		}
	}

}
