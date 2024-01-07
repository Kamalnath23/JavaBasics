package wordfinding;
import java.util.*;
public class WordFinding {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int n = sc.nextInt();
		if(n<=0){
		System.out.println(n+" is less than the desired limit");
		return;
		}
		String set1[] = new String[n];
		String set2[] = new String[n];
		System.out.println("Enter the words in set1:");
		for(int i = 0;i<n;i++){
		set1[i] = sc.next().toLowerCase();
		}
		System.out.println("Enter the words in set2:");
		for(int i = 0;i<n;i++){
		set2[i] = sc.next().toLowerCase();
		}

		String res[]= new String[n];
		int k=0; //int x=0;
		
		for(int i = 0;i<n;i++){
			int flag = 0;
			for(int j = 0;j<n;j++){
				if(set1[i].equals(set2[j])){
					flag = 1;
					break;
				}
			}
			if(flag != 1){
			res[k++] = set1[i];
			//res[x++]= set2[i];
			}
			}

		
		System.out.println("The uncommon words are:");
		for(int i = 0;i<k;i++){
		System.out.println(res[i]);
		}
		
		
		
		

		
		
		

	}

}
