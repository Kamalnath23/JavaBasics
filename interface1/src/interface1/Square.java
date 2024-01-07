package interface1;

public class Square  implements Shape{
	private float side;
	
	public Square(float side) {
		this.side=side;
	}
	
	public float calculateArea() {
		float area=side*side;
		return area;
		
	}
	
	
	public float calculatePerimeter() {
		float perimeter=4*side;
		return perimeter;
	}

}
