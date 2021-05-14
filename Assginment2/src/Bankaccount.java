
public class Bankaccount {
	int fixdepo;
	int credit;
	int total=20000;
	

	public static void main(String[] args) {
		
		Bankaccount bank=new Bankaccount();
		saving sav=new saving();
		current cur=new current();
		
		
		sav.totalcash(20000, 0);
		cur.totalcash(0, 30000);
		
		

	}
	
	
	
	public void toatlcash()
	{     
		int t=total+fixdepo+credit;
	
		
	}
	
	void totalcash(int fixdepo,int credit)
	{
		
		int t=total+fixdepo+credit;
		
		
	}
	

}

class saving extends Bankaccount{
	 
	void totalcash(int fixdepo,int credit)
	{
		
		int t=total+fixdepo+credit;
		
		System.out.println("the saving account total cash"+t);
		
		
	}
	
}

class current extends Bankaccount{
	
	void totalcash(int fixdepo,int credit)
	{
		
		int t=total+fixdepo+credit;
		System.out.println("the current account total cash"+t);
		
	}
	
}
