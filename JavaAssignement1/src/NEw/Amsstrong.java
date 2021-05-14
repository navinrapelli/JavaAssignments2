package NEw;
import java.util.Scanner;
public class Amsstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int input1=sc.nextInt();
		
		int b=input1;
		
		int a=0;
		int c=0;
		
		while(input1!=0) {
			
			
			a=input1%10;
			c=c+(a*a*a);
			
			input1=input1/10;
			
			
			
			
		}
		
		if(c==b)
		{
			System.out.println("The given number is amstrong number");
			
		}
		else
		{
			System.out.println("The given number is  not amstrong number");
			
		}
		

	}

}
