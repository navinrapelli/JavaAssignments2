package Lambda;
import java.util.Scanner;


public class BasicsArithmatic {
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
	
	Arithmatic1 ArthimataicOperations1=(c,d)-> c+d;
	
	
	System.out.println("for addition="+ArthimataicOperations1.navin(a,b));
	
	Arithmatic1 ArthimataicOperations=(c,d)-> c/d;
	
	System.out.println("for division="+ArthimataicOperations.navin(a,b));
	
	Arithmatic1 ArthimataicOperations3=(c,d)-> c*d;
	System.out.println("for multiplication="+ArthimataicOperations3.navin(a,b));
	Arithmatic1 ArthimataicOperations4=(c,d)-> c-d;
	System.out.println("for subsraction="+ArthimataicOperations4.navin(a,b));
	
	
	
}

}
interface Arithmatic1
{
	float navin(int a,int b);



}