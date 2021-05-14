package Lambda;

import java.util.ArrayList;

public class lambdafive {

	public static void main(String[] args) {
		ArrayList<String>navin=new ArrayList<String>();
		
		navin.add("Navin");
		navin.add("Venky");
		navin.add("Naga");
		navin.add("Shital");
		navin.add("Swapnali");
		navin.add("Pratik");
		StringBuilder pav=new StringBuilder();
		
		
		navin.stream()
		.map(s->s.substring(0,1))
		.forEach(s->pav.append(s));

		
		System.out.println(pav);
		
	}

}
