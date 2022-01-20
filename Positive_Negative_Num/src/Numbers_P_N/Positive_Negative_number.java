package Numbers_P_N;

import java.util.Scanner;

public class Positive_Negative_number {
	
	
		public static void main(String[] args)
		
		{
			int num;
	
			Scanner sc=new Scanner(System.in);
			System.out.print(" Enter the number you want to check: ");
			num=sc.nextInt();
			sc.close();
			
			if (num > 0)
			{
				System.out.println(num +" is positive number");
			}
			else 
			{
				System.out.println(num +" is negative number ");
			}
			
			
		}
		
	}


