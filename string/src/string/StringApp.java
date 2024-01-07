package string;

public class StringApp {
	public static void main(String[] args) {
		String name="Mini";
		System.out.println("Length: "+name.length());
		
		System.out.println("Character at: "+name.charAt(3));
		
		String name1="Java";
		name1=name1.concat(" Program");
		System.out.println(name1);
		
		System.out.println(name1.subSequence(0, 4));
		System.out.println(name1.substring(0));
		System.out.println(name1.substring(0, 4));
		System.out.println(name1.subSequence(0, 7));
		
		String name2="Mini";
		String name3= new String("Mini");
		
		System.out.println(name==name2);
		System.out.println(name==name3);
		System.out.println(name.equals(name3));
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.print("end");
	}

}
