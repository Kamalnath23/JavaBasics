package tutorial16;
class Robot
{
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: "+height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving "+distance+ " in direction "+direction);
	}
}
public class MethodsParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot chitti= new Robot();
		chitti.speak("Hi this is chitti v2.0 reloaded");
		chitti.jump(7);
		chitti.move("North-East", 12.24);
		
		String greeting ="Hello there";
		chitti.speak(greeting);
		
		int value=14;
		chitti.jump(value);

	}

}
