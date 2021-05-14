package Lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;


public class LambdaSix {

	public static void main(String[] args) {
ArrayList<String>navin=new ArrayList<String>();
		
		navin.add("Navin");
		navin.add("Venky");
		navin.add("Naga");
		navin.add("Shital");
		navin.add("Swapnali");
		navin.add("Pratik");
		
		navin.replaceAll(t->t.toUpperCase());
	
		System.out.println(navin);
		

	}

}

/*class Op implements UnaryOperator<String>
{

	@Override
	public String apply(String t) {
		
		return t.toUpperCase();
		
	}
	


}*/