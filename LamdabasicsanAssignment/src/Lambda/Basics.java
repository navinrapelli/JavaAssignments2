package Lambda;

public class Basics {

	public static void main(String[] args) {
		
		Mylambdaa Mylambda =() -> System.out.println("Hellow wolrd");
			 
		Mylambda.navin();

		Myadd myadd1=(int a,int b)-> a+b;
		
		System.out.println(myadd1.add1(23, 24));
	}

}

interface Mylambdaa
{
	
	void navin();
}


interface Myadd
{
	int add1(int a,int b);
}