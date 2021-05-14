package Lambda;

import java.util.ArrayList;

public class Lambdafour {

	public static void main(String[] args) {
		
	
	ArrayList<String>na=new ArrayList<String>();
	
	na.add("Navin");
	na.add("Venky");
	na.add("Naga");
	na.add("Shital");
	na.add("Swapnali");
	na.add("Pratik");
	
	System.out.println(na);
	
	na.removeIf(t->(t.length()%2==1));
	System.out.println(na);
	
	 na.stream()
	.filter(p->(p.length()%2==1))
	.forEach(p->System.out.println("\n"+p));

	
	}
	
}
