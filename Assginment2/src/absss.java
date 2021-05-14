
public class absss {

	public static void main(String[] args) {
		audio a=new audio();
		bmw b=new bmw();
		
		a.start();
		b.start();
		

	}

}

class audio extends car{

	@Override
	void start() {
		System.out.println("audio is running");
		
	}
}
	
 class bmw extends car{

	@Override
	void start() {
		System.out.println("audio is running");
		
		
	}

	
	

	
	
}

abstract class car{
	int Price;
	
	abstract void start();
}
