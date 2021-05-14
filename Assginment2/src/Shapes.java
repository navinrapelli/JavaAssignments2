
abstract class Shapes {

	public static void main(String[] args) {
		Line li=new Line();
		Rectangle re=new Rectangle();
		Cube cu=new Cube();
		
		li.draw();
		re.draw();
		cu.draw();
		

	}

	
	abstract void draw();
}

class Line extends Shapes{


	void draw() {
		System.out.println("Drawing Line.....");
		
	}
	
	
	
}

class Rectangle extends Shapes{

	
	void draw() {
		System.out.println("Drawing Rectangle.....");
		
	}
	
	
}
class Cube extends Shapes{

	
	void draw() {
		System.out.println("Drawing Cube.....");
		
	}
	
	
	
	
}



