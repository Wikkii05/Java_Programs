package RandomArray;

import java.util.Random;

public class RandomArrayDemoClass {
	
	
	  public static void main(String[] args)
	  {
		  Random rd= new Random();
		  int[] arr = new int [] {1,2,3,4,5};
		  
		  for (int i=0;i<arr.length;i++)
		  {  
			 arr[i]=rd.nextInt();
		 
				System.out.println(arr[i]);
	       } 

	  }
}
