package tutorial28;

public class App {
	public static void main(String[] args) {
		byte bytevalue=20;
		short shortvalue=55;
		int intValue=888;
		long longvalue=23355;
		
		float floatvalue=8853.3f;
		float floatvalue2=99.3f;
		double doublevalue= 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		intValue = (int)longvalue;
		System.out.println(intValue);
		
		doublevalue= intValue;
		System.out.println(doublevalue);
		
		intValue= (int)floatvalue; //cast
		System.out.println(intValue);
		
		//following wont work as we except it tto
		//128 is too big for byte
		bytevalue= (byte)128;
		System.out.println(bytevalue);
	}
}
