package rectangle;
import java.util.*;

class Rectangle{
	private float length;
	private float breadth;
	
	//constructor
	public Rectangle(float length, float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	// functions to calculate area
	public float calculateArea() {
		return length*breadth;
	}
	
	//function to calculate the difference between 2 areas
	public float diffInArea(Rectangle r) {
		float area_difference=(this.calculateArea()-r.calculateArea());
		return area_difference;
	}
}

public class RectangleQuest {

	public static void main(String[] args) {
		Rectangle r1= new Rectangle(6,9);
		Rectangle r2= new Rectangle(12,15);
		
		float DIA= r1.diffInArea(r2);
		System.out.println("Area Difference is "+DIA);
		
		
	}

}
