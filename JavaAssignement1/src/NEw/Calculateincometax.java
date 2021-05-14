package NEw;
import java.util.Scanner;

public class Calculateincometax {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner nv=new Scanner(System.in);
		System.out.println("Enter the income range");
		int income=nv.nextInt();
		
		
		if(income>=0 && income<=180000)
		{
			
			System.out.println("The tax pay in percentage is Nil");
			
			
		}
		else if (income>=180001 && income<=300000 )
		{
			
			
			System.out.println("The tax pay in percentage is 10%");	
			
		}
		else if(income>=300001 && income<=500000)
		{
			
			
			System.out.println("The tax pay in percentage is 20%");	
			
		}
		else if(income>=500001 && income<=1000000)
		{
			
			System.out.println("The tax pay in percentage is 30%");	
		}
		
		

	}

}
