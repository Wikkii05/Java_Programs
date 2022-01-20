package object;

 class Cars 
		
		{
			 int roll_no ;
			 String name ;
			 Cars(int roll_no,String name)
			 {
				 this.roll_no=roll_no;
				 this.name =name;
			 }
		}
   
 public class Object_Array{
	 
	 public static void main(String[] args)
	 
	 {
		 Cars[] arr;
		 
		 arr = new Cars [5];
				 
		arr[0]=new Cars(1,"BMW");
		arr[1]=new Cars(2,"AUDI");
		arr[2]=new Cars(3,"BENZ");
		arr[3]=new Cars(4,"JAGUAR");
		arr[4]=new Cars(5,"LAMBORGINI");
		
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Element at"+ i + " : " +arr[i].roll_no +" "+arr[i].name);
		}
	}

}
