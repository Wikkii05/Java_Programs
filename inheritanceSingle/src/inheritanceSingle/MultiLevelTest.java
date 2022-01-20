package inheritanceSingle;

class four {
	      
	      public void print_vicky()
	         {
	    	  System.out.println(" Vicky ");
	         }
          }
class five extends four {
	      public void print_for()
	         {
	    	  System.out.println(" for ");
	         }
                      }
class six extends five {
	      public void print_vicky()
	         {
	    	  System.out.println(" Vicky ");
	         }
	      
                        }
public class MultiLevelTest {
          public static void main(String [] args) {
        	  
        	  six v = new six ();
        	  v.print_vicky();
        	  v.print_for();
        	  v.print_vicky();
                            }
}



