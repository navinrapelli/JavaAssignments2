package NEw;
import java.util.Scanner;
public class compoundandsimple {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Principal");
		double principal=sc.nextDouble();
		System.out.println("Enter the rate");
		double rate=sc.nextDouble();
		System.out.println("Enter the time");
		double time=sc.nextDouble();
		System.out.println("Enter number of times interest is compunded");
		double timeperiod=sc.nextDouble();
		
		double si= ((principal*rate*time)/100);
		double ci= principal*(Math.pow((1+rate/100),(time*timeperiod)))-principal;
		
		
		
		System.out.println("the simple intrest is"+ si);
		System.out.println("the compund intrest is"+ci);
	

	}

}
