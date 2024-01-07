package interface1;

public class Rectangle implements Shape{
	private float length;
	private float breadth;
	
	public Rectangle(float length,float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public float calculateArea() {
		float area=length*breadth;
		return area;
	}
	
	public float calculatePerimeter() {
		float perimeter= 2*(length*breadth);
		return perimeter;
	}

}
