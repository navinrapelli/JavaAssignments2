package Lambda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lambdaseven {

	public static void main(String[] args) {
		
		HashMap<String,String> h=new HashMap<String, String>();
		StringBuilder p=new StringBuilder();
		
		 h.put("Navin", "Venky");
		 h.put("Rohan", "Narsha");
		 h.put("Naga", "Asha");
		 
		 
		 
		 Set s1=h.entrySet();
		 System.out.println(s1);
		 
         Iterator na=s1.iterator();
         while(na.hasNext())
         {
        	 Map.Entry m1 =(Map.Entry)na.next();
             String n=(String) m1.getKey()+m1.getValue();
        	 p.append(n);

         }
         
         System.out.println(p);
	}

}
