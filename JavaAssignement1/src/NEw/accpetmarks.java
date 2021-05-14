package NEw;
import java.util.Scanner;
public class accpetmarks {

	public static void main(String[] args) {
		Scanner nav=new Scanner(System.in);
		
		int a=0;
		int b=0;
		int c=0;
		
		int[] A= new int[3];
		int[] B= new int[3];
		int[] C= new int[3];
		System.out.println("Enter the Marks of first student");
		for(int i=0;i<3;i++)
		{
			A[i]=nav.nextInt();
			a=A[i]+a;
			
		
		}
		  
		System.out.println("the total marks of student first is "+a);
		System.out.println("the averge mark of student first is"+ (a/3));
		
		
		System.out.println("Enter the Marks of 2nd student");
		for(int i=0;i<3;i++)
		{
			B[i]=nav.nextInt();
			b=B[i]+b;
		}
		System.out.println("the total marks of student second is "+b);
		System.out.println("the averge mark of student second is"+ (b/3));
		
		System.out.println("Enter the Marks of 3nd student");
		for(int i=0;i<3;i++)
		{
			C[i]=nav.nextInt();
			c=B[i]+c;
		}
		System.out.println("the total marks of student third is "+c);
		System.out.println("the averge mark of student third is"+ (c/3));
		
		
		
		
		int total=A[0]+B[0]+C[0];
		System.out.println("the total marks in sub A is "+total);
		System.out.println("the average maks in sub A  is "+(total/3));
		
		int total1=A[1]+B[1]+C[1];
		System.out.println("the total marks in sub A is "+total1);
		System.out.println("the average maks in sub A  is "+(total1/3));
		
		int total2=A[2]+B[2]+C[2];
		System.out.println("the total marks in sub A is "+total2);
		System.out.println("the average maks in sub A  is "+(total2/3));
		
	
		
	
		
		

	}
	
	
	

}
