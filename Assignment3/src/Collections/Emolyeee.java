package Collections;

import java.util.HashMap;

public class Emolyeee {
	int dd;
	int mm;
	int yy;

	public Emolyeee(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
	 public String toString()
	 {
		 
		 return  dd+"|"+mm+"|"+yy+"|";
	 }
	 
	 


}
     
class Date{
	
	
	    static Emolyeee em1= new Emolyeee(29, 5, 1999);
	    static Emolyeee em2= new Emolyeee(29, 6,1996);
	    static Emolyeee em3= new Emolyeee(24,6,1997);
	    public static void  main(String[] args) {
			
		
	   //HashMap<Emolyeee,String> h= new HashMap< Emolyeee,String>();
	   
	           //h.put(em1, "navin");
	           //h.put(em2, "pavan");
	    	 getmethod();
	    	
	    }
	
	
	    
	    public static void getmethod( )
		   {  
	    	
	 	   HashMap<Emolyeee,String> h= new HashMap< Emolyeee,String>();
	 	   
	 	           h.put(em1, "navin");
	 	           h.put(em2, "pavan");
	 	           h.put(em3, "asha");
	    	
	    	      
		           if(em1.dd==em2.dd || em1.mm==em2.mm)
		           {
		        	   
		        	  System.out.println("the date or month are same");
		        	   
		           }
		           else
		           {
		        	   
		           
		           System.out.println(h);
		           }
		   }
	   
	    
}





