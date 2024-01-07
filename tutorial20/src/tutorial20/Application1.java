package tutorial20;

public class Application1 {

	public static void main(String[] args) {
		
		//inefficient
		String info="";
		info += "My name is Bob.";
		info +=" ";
		info +="I am a builder";
		
		System.out.println(info);
		
		//More efficient
		StringBuilder sb=new StringBuilder("");
		sb.append("My name is sue.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		
		System.out.println(sb.toString());
		
		StringBuilder s= new StringBuilder();
		s.append("My name is Rogger.")
		.append(" ")
		
		.append("I am a sky diver");
		
		System.out.println(s.toString());
		
		// Formatting //
		
		System.out.print("Here is some text.\tThat was a tab.\nThat was new line.");
		System.out.println(" More text.");
		
		// Formatting Integers //
		System.out.printf("Total cost %10d; Quantity is %d\n", 5,120);
		
		for(int i=0; i<20; i++) {
			System.out.printf("%2d: %s\n", i,"here is some text");
		}
		
		// Formatting floating point value//
		System.out.printf("Total value: %.2f\n", 5.3);
		System.out.printf("Total value: %.2f\n", 5.37896);
		System.out.printf("Total value: %7.1f\n", 123.24365);
	}

}
