package BicycleDemo;
  

class Bicycles{
	 public int gear;
	 public int speed;

	 
	 public Bicycles(int g,int s)
	    {
		 gear  = g;
		 speed = s;
	    }
	 public void applyBrake(int decrement)
	    {
		 speed -= decrement;
	    }
	 public void speedUp(int increment)
	    { 
		 speed += increment;
	    }
	 public String toString()
	    {
		 return (" Number of gears are " + gear + "\n" + " speed of bicycle is " + speed);
	     }
}
class MountainBike extends Bicycles { 
	 
	 public int seatHeight;
	 
	 
	 public MountainBike(int gear, int speed, int startHeight)
	    {
		 super ( gear, speed);
		 seatHeight = startHeight ;
	    }	
	 public void seatHeight (int newValue)
	    {
	     seatHeight = newValue;
	    }
	 public String toString()
	    {
		 return (super.toString() + " \nseat height is " + seatHeight);
	    }
}

public class Bicycle {
	 public static void main(String[] args)
	    {
		  MountainBike mb = new MountainBike(6, 50, 5);
		  System.out.println(mb.toString());
	    }               
}            






