package ArrayCopy;

public class ArrayCopyDemo {
	
	
	public static void main (String [] args) 
	 
	
	{
		int [] Original = {10,20,30,40,50,60,70,80,90};
		int [] copy     = Original;
		   
		      System.out.println("Original array is : ");
		      
		      Original[8]=100;
		        for (int i=0;i<Original.length;i++)
		        	System.out.print(Original[i]+"\t");
		        
		        System.out.println("\nCopied array is : ");
		        for (int i=0;i<copy.length;i++)
		        	System.out.print(copy[i]+"\t");
		        
	}

}
