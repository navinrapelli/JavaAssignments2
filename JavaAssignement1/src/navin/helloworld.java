package navin;
public class helloworld {

	public static void main(String[] args) {
		
		persons p1=new persons("Navin",22);
		
		persons p2=new persons("Pavan",19);
		
		devloper dev=new devloper("venky", 23);
	
		//p1.name="Navin";
	    //p1.age=21;
	    
	    //p2.name="Pavan";
	    //p2.age=18;
		
	    //System.out.println(p1.name+" "+p1.age);

	    //System.out.println(p2.name+" "+p2.age);
	    
	    //p1.read(3);
	    //p2.write();
		
		dev.read();
	    
	    
		
		
	}
}

	class devloper extends persons{

		public devloper(String name, int age) {
			super(name, age);
			
			
		}
		
		
		void read()
		{
			System.out.println(name+"  is reading");
			
		}
	
	}
 class persons
	{
		String name;
		int age;
		int height;
		
		/*int count;
		public persons()//by defualt constuctor which is creaated by class constructor used to create new obj
		{    count++;
			System.out.println("creating the costuctor");
			
		}*/
		public persons(String name,int age)//constructor overload
		{   //this()//use for calling one constructor //and also used to access variable in same class
		
		
		this.name=name;
		this.age=age;
			
			
		}
		
		
		
		
		void write()
		{
			
			System.out.println(name+"  is writing");	
			
		}
		
		void read(int pages)//Run time poly
		{
			
			System.out.println(name+"  is reading "+pages+" pages");
		}
		
		
	}


