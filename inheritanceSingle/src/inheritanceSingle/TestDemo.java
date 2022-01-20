package inheritanceSingle;
 
import java.io.*;
import java.util.*;


class one {
        	  public void print_geeks()
	          {
	          System.out.println(" Geeks ");
              }
}
class two extends one {
              public void print_for()
              {
	          System.out.println(" for ");
              }
}
public class TestDemo {
	
	         public static void main (String[] args)
	         {
		     two g = new two();
	        	g.print_geeks();
		        g.print_for();
		        g.print_geeks();
           	 }
	         
           }
	         
     




