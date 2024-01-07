package fibonacciseries;

public class FibonaciSeries {
public static void main(String[] args) {
	int a=0,b=1,c=0,count=2;
	System.out.printf("%d,%d",a,b);
	
	while(count<20) {
		c=a+b;
		System.out.printf(",%d",c);
		
		if(c%12==0) break;
		
		count++;
		a=b;
		b=c;
	}
}
}
