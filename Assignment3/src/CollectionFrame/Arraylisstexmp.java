package CollectionFrame;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Arraylisstexmp {

	public static  void main(String[] args) {
		

		ArrayList arr=new ArrayList();
		
		arr.add( "Navin");
		arr.add( "Naga");
		arr.add( "Narsing");
		arr.add( "Rohan");
		arr.add( "Ashish");
		arr.add(2);
		
		System.out.println(arr);
		
		ListIterator  l= arr.listIterator(arr.size());
		
		while(l.hasPrevious())
		{
			Object s=l.previous();
			System.out.println(s);
			
			
			
		}
		

	}

}
