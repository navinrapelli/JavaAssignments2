package NEw;
import java.util.Scanner;

public class logincredential {
	

      static int count;
	public static void main(String[] args) {		
	
		Scanner user12=new Scanner(System.in);
		
		for(int i=0;i<=2;i++){
		System.out.println("Enter the username");
		String pass=user12.nextLine();
		System.out.println("Enter the pass ");
        String pass1=user12.nextLine();
        
		

		if(pass.equals("Navin")&& pass1.equals("navin@123"))
		{
			
			
			System.out.println("Welcome");
			break;
			
		}
		else
		{
					
	       
        		count++;
                
		}
		
		}
		             if(count==3)
		                  {
		
		                   System.out.println("Contact Admin");
	
		
		             }
	}
	
	


	


}


