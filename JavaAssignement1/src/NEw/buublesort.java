package NEw;

public class buublesort {

	public static void main(String[] args) {
	
		int navin1[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		int temp=0;
		
		for(int i=0;i<navin1.length-1;i++)
		{
		
		    for(int j=0;j<navin1.length-1;j++)
		    {
		    	if(navin1[j]>navin1[j+1])
		    	{
		       temp=navin1[j];
		       navin1[j]=navin1[j+1];
		       navin1[j+1]=temp;
		    	}
		    }
		    
		}
		
		for(int i=0;i<navin1.length-1;i++)
		{
			
			System.out.println(navin1[i]);
		}
		
		

	}

}
