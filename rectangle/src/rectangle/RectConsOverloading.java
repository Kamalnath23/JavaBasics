package rectangle;
import java.util.*;

class Rectangl{
	private float length;
	private float breadth;
	
	//constructor
	public Rectangl() {
		length=1;
		breadth=2;
	}
	
	public Rectangl(float length, float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	// functions to calculate area
	public float calculateArea() {
		return length*breadth;
	}
	
	//function to calculate the difference between 2 areas
	//public float diffInArea(Rectangle r) {
		//float area_difference=(this.calculateArea()-r.calculateArea());
		//return area_difference;
	//}
}

public class RectConsOverloading {

	public static void main(String[] args) {
		Rectangl r1= new Rectangl(12,15);
		Rectangl r2= new Rectangl();
		
		float DIA= r1.calculateArea()-r2.calculateArea();
		System.out.println("Area Difference is "+DIA);
	}

}
