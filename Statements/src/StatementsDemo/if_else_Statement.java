package StatementsDemo;

import java.util.Scanner;

public class if_else_Statement {


	
         public static void main (String [] args)
         
         {
      	   int number ;
      	   
      	     System.out.println("Enetr the Interger Number: ");
      	     
      	     
      	     try (Scanner input = new Scanner (System.in)) {
				number = input.nextInt();
			}
      	     if (number % 2 == 0)
      	     {
      	    	 System.out.println("Enter the number is Even");
      	     } 
      	     else 
      	     {
      	    	 System.out.println ("Enter the number is Odd");
      	     }
         }
}



