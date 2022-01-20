class Bicycles {
	
	public int gear;
	public int speed;  
	  
	public Bicycles (int g, int s)
	
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
	 return (" no of gears are " + gear + "\n" + "speed of Bicycles is " + speed);
	}
	  
}
	   
  
   
class MountainBike extends Bicycles {
	
	public int seatHeight;
	
	public MountainBike (int gear,int speed,int seatHt)
	
	{
	super(gear,speed);
	seatHeight = seatHt ;
	}
	public void seatHeight(int newValue)
	
	{
	seatHeight = newValue;
	}
	
    public String toString()
    {
   	return(super.toString() + "\nseat Height is " + seatHeight);
    }
} 
  
    public class Bicycle {
	public static void main(String[] args)
	 { 
	  MountainBike mb = new MountainBike(10,50,100);
	  System.out.println(mb.toString());
	 }

}
