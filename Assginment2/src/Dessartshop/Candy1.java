package Dessartshop;

import java.util.Scanner;

public class Candy1 extends dessarts {
	
	int costCandy;
	int countCandy;
	int sumCandy=1;
	@Override
	void getCost() {
		System.out.println("Enter the number of candies");
		Scanner num=new Scanner(System.in);
		countCandy=num.nextInt();
		costCandy=(countCandy*60);
		System.out.println("total cost in Rupees: "+ costCandy +"\nin dollars : "+(costCandy/60));		
	}

	
	
	

}
