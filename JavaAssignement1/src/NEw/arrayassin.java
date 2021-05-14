package NEw;
import java.util.Scanner;
public class arrayassin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numberr");
		int no=sc.nextInt();
		int navin1[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		
		for(int i=0;i<navin1.length;i++)
		{
			
			
			if(no==navin1[i])
			{
				
				
				break;
			}
			
		}
		
		
		System.out.println("the number "+no+"is contained in arry");
		
		
		

	}

}
