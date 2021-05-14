package Dessartshop;

import java.util.Scanner;

public class Cookie extends dessarts{
	int costCookie;
	int countcookie;
	int sumCandy=1;

	
		
		@Override
		void getCost() 
		{
			System.out.println("Enter the number of packets of cookie ");
			Scanner num=new Scanner(System.in);
			countcookie=num.nextInt();
			costCookie=(countcookie*70);
			System.out.println("total cost in Rupees: "+ costCookie +"\nin Euros : "+(costCookie/70));		
		}		
	

}
