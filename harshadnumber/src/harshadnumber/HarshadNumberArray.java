package harshadnumber;
import java.util.*;

public class HarshadNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n = sc.nextInt();
		int i;
		System.out.println("Enter the numbers");
		int[] a = new int[n];
		if (n > 0)
		{
			int flag = 0;
			int k = 0;
			for (i = 0; i < n; i++){
				k = sc.nextInt();
				if (k > 9)
					a[i] = k;
				else{
					flag = 1;
					break;
				}
			}
		
		
			if (flag != 1){
				int c = 0;
				for (i = 0; i < n; i++){
					int x = a[i];
					int sum = 0;
					do {
						int r = x % 10;
						sum = sum + r;
						x = x / 10;
					}
					while (x != 0);
					
					if (a[i] % sum == 0){
						c++;
						System.out.println(a[i]);
					}
				}
				if (c == 0)
					System.out.println("The " + n + " values are not harshad number");
			}
			else
				System.out.println("Provided " + k + " is not valid");
		} 
		else
			System.out.println(n + " is an invalid input");
	}

}
