package tutorial1;


public class Miss {
	public static void main(String[] args) {
		
		int array[] ={1,2,4,2,5,2,6}; 
	    int pos=-1; int value=2; 
	    int itr; 
	    for ( itr = 0; itr < array.length; itr++)
	    { 
	      if(array[itr]!=value)
	      { 
	        continue; 
	      } pos=itr; 
	    } 
	    System.out.println(pos); 
		
		 
}
}

