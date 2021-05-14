package CollectionFrame;
import java.util.*;
public class uuse {

	String name;
	int id;
	
	uuse(String name,int id)
	{
		this.name=name;
		this.id=id;
		
		
	}
	
	public String toString()
	{
		
		return name+"..."+id;
	}
	

}

class demo{
	public static void main(String[] args) {
		
		uuse u1=new uuse("Pavan", 123);
		uuse u2=new uuse("Navin",245);
		uuse u3=new uuse("Akash",89);
		
		
		TreeSet t=new TreeSet();
		t.add(u1);
		t.add(u2);
		t.add(u3);
		
		
		System.out.println(t);
	}
	
	
	
}
