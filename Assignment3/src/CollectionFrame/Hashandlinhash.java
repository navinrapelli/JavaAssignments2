package CollectionFrame;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashandlinhash {

	public static void main(String[] args) {
		
       
		HashSet<String> h=new HashSet<String>();
		h.add("N");
		h.add("P");
		h.add("7");
		h.add("A");
		
		System.out.println("hash set output which is unorderd "+h);
		
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		l.add("N");
		l.add("P");
		l.add("2");
		l.add("A");
		
		System.out.println("hash set output which is orderd "+l);
		
		
		
	}

}
