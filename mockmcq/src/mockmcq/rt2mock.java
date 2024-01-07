package mockmcq;

public class rt2mock {

	public static void main(String[] args) {
		
		//Q1
		// TODO Auto-generated method stub
		 int array[] ={1,2,4,2,5,2,6}; 
		    int pos=-1; 
		    int value=2; 
		    int itr; 
		    for ( itr = 0; itr < array.length; itr++)
		    { 
		      if(array[itr]!=value)
		      { 
		        continue; 
		      } 
		      pos=itr;
		    }
		    System.out.println(pos);
		    
		    
		    //Q2
		    int[] array1 = {11,22,33,44,55,11}; 
		    int searchNumber = 11, position=999; 
		     for(int index=0; index < array1.length; index++)
		     { 
		       if(searchNumber == array1[index])
		       { 
		         position = index; 
		       } 
		     } 
		     System.out.println(position); 
		     
		     //Q3
		     int value1=33; System.out.println(value1);
		     int value2=--value1; System.out.println(value2);
		     int value3=value1++; 
		     System.out.println(value1+" "+value2+" "+value3);
		     
		     int val4=10; System.out.println(val4);
		    // int val6=--val4;
		     int val5=val4++;
		     System.out.println(val4+" "+" "+val5);
	}

}
