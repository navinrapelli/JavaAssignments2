package CollectionFrame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee {

   public Boolean equals()
   {
	return true;
	      
   }
   
   public int Hashcode()
   {
	return 2;
	   
   }

}

class navin{
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		Boolean n1= e.equals();
		int  n2=e.Hashcode();
		
		HashMap nav=new HashMap();
		Set s1=nav.entrySet();
				
	    nav.put(n1, "navin");
		nav.put(n2, "Pavan");
		nav.put(4, "Venky");
			
		System.out.println(s1);
		System.out.println(nav.get(true));
		System.out.println(nav.getOrDefault(1, e));
		
		/*Iterator i=s1.iterator();
			
				
				while(i.hasNext())
				{
					Map.Entry m1=(Map.Entry)i.next();
					System.out.println(m1.getKey()+"..."+m1.getValue());
					
					
					
				}*/
				
	}
	
}
