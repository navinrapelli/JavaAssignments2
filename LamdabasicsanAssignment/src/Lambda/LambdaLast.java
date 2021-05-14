package Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class LambdaLast {

	public static void main(String[] args) {
ArrayList<Integer>navin=new ArrayList<Integer>();
		
		navin.add(40);
		navin.add(43);
		navin.add(56);
		navin.add(80);
		navin.add(89);
		navin.add(13);
		
		
	
		
	Thread n=new Thread(new Runnable() {

		@Override
		public void run() {
			
			navin.stream()
			.forEach(t->System.out.println(t));
		}
		
	});
	
	n.run();
	
	}
}


