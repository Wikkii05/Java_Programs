package multifications_Tables;

import java.util.Scanner;

public class Multifications_Table_Try {
	
	public static void main(String[] args)

	
	 {
		 
		    int i,n;
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the number : ");
				n=sc.nextInt();
			} 
				int[] a= {1,2,3,4,5,6,7,8,9,10};
			
	        for( i=0;i<10;i++)
	    
	        {
	        	int b = n* a[i];
	        	
				System.out.println(a[i]+" * "+n+" = "+b);
	        }
	        
	 }
		 
}
