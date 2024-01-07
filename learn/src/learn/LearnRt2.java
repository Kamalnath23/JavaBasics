package learn;

public class LearnRt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc";
		System.out.println(s.length()+ " is length of string "+s);
		s=s.concat("de");
		System.out.println("concat of s: "+s);
		System.out.println(s.charAt(0));
		System.out.println("True/false: "+s.startsWith("a"));
		System.out.println("True/false: "+s.startsWith("cd",2));
		System.out.println(s.endsWith("e"));
		System.out.println(s.endsWith("de"));
		//split
		System.out.println("S P L I T"+ " SPLIT FUNCTION IN JAVA");
		String mob_no= "044-666-7240";
		String parts[]= mob_no.split("-");
		System.out.println("oth part "+ parts[0]);
		System.out.println();
		
		String cfg="geeks@for@geeks";
		String acfg[]= cfg.split("@",2);
		for(String z:acfg) System.out.println(z);
		String acfgs[]= cfg.split("s");
		for(String y:acfgs) System.out.println(y);
		
		//split2
		String comp="word1, word2 word3@word4?word5.word6";
		String comparr[]= comp.split("[, ?.@]+");
		for(String x:comparr) System.out.println(x);
		
		//String to Char
		char ca[]=s.toCharArray();
		for(char c:ca) {
			System.out.print(" "+c);
		}
		System.out.println();
		
		//String to bytes
		byte ba[]=s.getBytes();
		for(byte b:ba) {
			System.out.print(" "+b);
		}
		
		String s1="abc1234@";
		//StringBuilder to reverse
		StringBuilder sb= new StringBuilder(s1);
		sb=sb.reverse();
		s1=sb.toString(); //convert string builder to string
		System.out.println();
		System.out.println("reverse string is: " +s1);
		
		//
		String s2=new String("abc1234@");
		StringBuilder sb1= new StringBuilder(s2);
		sb1.setCharAt(0,'@');
		s2=sb1.toString();
		System.out.println(s2);
		
		//String.valueOf --- it converts any of type to string
		int k=123;
		String str=String.valueOf(k);
		System.out.println(str+1);
		
		String str1= new String("abc");
		byte arr[]=str1.getBytes();
		System.out.println(arr[0]);
		char c= (char) arr[0];
		System.out.println(c);
		

	}

}
