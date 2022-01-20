package ToUpperCase;

import java.util.Scanner;

public class ToUpperCaseExample {
	
  public static void main(String[] args)
	  {
		  Scanner v =new Scanner(System.in);
		  int no ;
		  
		  no=v.nextInt();
			  System.out.println(no);
			  
		  v.skip(System.lineSeparator());
		  String[] names =new String[no];
		  
		  for(int i=0;i<no;i++)
			  
		  {
			  names [i]  = v.nextLine();
		  }
		  v.close();
		  
		  for (int i=0;i<no;i++)
			  
		  {
			  System.out.println(names[i].toUpperCase());
		  }
		  
	  }
		  
		     
		  
  }
	
	
		
		
			   
			   



