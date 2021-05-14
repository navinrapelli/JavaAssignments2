package CollectionFrame;
import java.util.*;

public class Person implements Comparable {
	int Weight;
	int Height;
	String name;

 Person(int Weight,int Height,String name)
 {  
	 this.Height=Height;
	 this.Weight=Weight;
	 this.name=name;
	 	 
 }
 public String toString()
 {
	 
	 return name+"__"+Height+"__"+Weight;
 }	



@Override
public int compareTo(Object o) {
	int Weight1=this.Weight;
	int Height1=this.Height;
	     Person p=(Person)o;
	     int Weight2=p.Weight;
	     int Height2=p.Height;
	     if(Weight1<Weight2)
	     {
	    	 return -1;
	     }
	     else if(Weight1>Weight2)
	     {
	    	 return +1;
	     }
	     else
	     {
	    	 if(Height1<Height2)
	    	 {
	    		 
	    		 return -1;
	    	 }
	    	 else if(Height1>Height2)
	    	 {
	    		 return 1;
	    	 }
	    	 
	     }
		return Height2;
	
	
}
}

class Sortmain{
	
	public static void main(String[] args) {
		Person p1=new Person(59, 5, "Navin");
		Person p2=new Person(66, 7, "Venky");
		Person p3=new Person(45, 8, "Ashish");
		Person p4=new Person(45, 6, "Naga");
		Person p5=new Person(45,4,"Narsha");
		
		TreeSet t=new TreeSet();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);
		t.add(p5);
		System.out.println(t);
		
	}
}