package ArrayClone;

import java.util.Scanner;

public class ArrayCloneDemo {
	
	  public static void main(String[] args)
	  
	  {
		  int originalArray[];
		  int cloneArray[] ;
		  int n=10;
			  
		  try (Scanner sc = new Scanner(System.in)) {
		//	System.out.println(" Enter the size of array :");
			//  size=sc.nextInt();
				      
			  originalArray =new int[n];
			  cloneArray    =new int[n];
			  System.out.println("Enter  element of the original array : ");
				      
			  for (int i=0;i<n;i++)
			  	{
				   originalArray[i]=sc.nextInt();
				 }
		}
		  for(int i=0;i<originalArray.length;i++)
			       {
			    	   cloneArray[i]=originalArray[i];
			       }
			       System.out.println("Elements of the original array :");
			          
			          for (int i=0;i<originalArray.length;i++)
			          {
			        	  System.out.print(originalArray[i]+" ");
			          }
			          
			         
			  System.out.println("\n\nElements of the clone array :");
			                
			   for (int i=0;i<cloneArray.length;i++)
					          
			    System.out.print(cloneArray[i]+" ");
			                
			                
	  }

}
