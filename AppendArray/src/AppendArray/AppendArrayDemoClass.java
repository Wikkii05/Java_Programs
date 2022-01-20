package AppendArray;

import java.util.Arrays;

public class AppendArrayDemoClass {
	
	public static void main(String[] args)
	
	{
		int[] arr = {10,20,30,40};
		   System.out.println(Arrays.toString(arr));
		   
		   arr = Arrays.copyOf(arr,arr.length + 1);
		   arr[arr.length-1] = 50;
		   
		   System.out.println(Arrays.toString(arr));
	}

}
