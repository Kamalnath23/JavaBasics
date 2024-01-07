package interface1;

public class ShapeUtility {
	public static void main(String[] args) {
		
		
		Shape s=new Square(10);
		System.out.println("Area of square "+ s.calculateArea());
		System.out.println("Perimeter of square "+s.calculatePerimeter());
		
		s=new Rectangle(5.1f,10.2f);
		System.out.println("Area of Rectangle "+s.calculateArea());
		System.out.println("Perimeter of rectangle "+s.calculatePerimeter());
	}
	
	

}
