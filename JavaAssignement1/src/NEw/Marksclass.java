package NEw;
import java.util.Scanner;
public class Marksclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks of math");
		int maths=sc.nextInt();
		System.out.println("Enter the Marks of marathi");
		int marathi=sc.nextInt();
		System.out.println("Enter the Marks of hindi");
		int hindi=sc.nextInt();
		
		
		if(maths>60&&marathi>60&&hindi>60)
		{
			
			System.out.println("the student is passed");
			
			
		}
		else if ((maths>60 && marathi>60 && hindi<60)||(maths>60 && marathi<60 && hindi>60)||(maths<60 && marathi>60 && hindi>60) )
		{
			
			
			System.out.println("the student is prmoted");
				
			
			
		}
		else 
		{
			
			
			System.out.println("the student is fail");
			
		}
		
		

	}

}
