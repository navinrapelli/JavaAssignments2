package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailfastandFailsafe {

	
	public static void main(String[] args) {
		
	
	/*ArrayList i=new ArrayList();
	
	i.add("navin");
	i.add(3);
	i.add("Pavan");
	i.add("om");
	
   Iterator i1=i.iterator();
   while(i1.hasNext())
   {
	   
	   Object a=i1.next();
	  i.add("om");
	   System.out.println(a);
	   
	   
	   
   }*/
		
		HashSet h=new HashSet();
		
		h.add("navin");
		h.add("pavan");
		h.add(9);

		Iterator i1=h.iterator();
		 while(i1.hasNext())
		   {
			   
			   Object a=i1.next();
			  h.add("om");
			   System.out.println(a);
			   
			   
			   
		   }
	
}
	}
