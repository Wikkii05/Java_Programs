package InsertValue;

import java.util.Arrays;

public class InsertValueArrayDemo {
	
	  public static void main (String[] args)
	      
	  { 
		  int [] my_array = {10,20,30,40,50,60,70,80,90,100};
		  
		  int index_position = 2;
		  int newValue = 55;
		  
		    System.out.println("Original Array : "+Arrays.toString(my_array));
		    
		    for (int i=my_array.length-1;i > index_position;i--)
		    {
		    	my_array[i]=my_array[i-1];
		    }
		      my_array[index_position] = newValue;
		      
		      System.out.println("New Array : "+Arrays.toString(my_array));
	  }

}
