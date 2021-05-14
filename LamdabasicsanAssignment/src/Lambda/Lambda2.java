package Lambda;
import java.util.Scanner;

public class Lambda2 {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the price of order");
		
		int Price=s.nextInt();
		
		if(Price>10000)
		{
		    order mylambda=( )-> System.out.println(" Order Accepted");
		    
		}
		else
		{
			System.out.println("Oder denied");
			
			
			
		}
		
	}
	
	
}

interface order
{
	  void price();


}