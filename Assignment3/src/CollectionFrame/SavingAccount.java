package CollectionFrame;


import java.util.Comparator;
import java.util.TreeSet;

public class SavingAccount {

	int accBalance;
	int   accID;
	String accHolderName;
	String isSalary;
	

	public SavingAccount(int accBalance, int accID, String accHolderName, String isSalary) {
		super();
		this.accBalance = accBalance;
		this.accID = accID;
		this.accHolderName = accHolderName;
		this.isSalary = isSalary;
	}
	
	public String toString()
	 {
		 
		 return  accID+"|"+accBalance+"|"+accHolderName+"|"+isSalary+"|";
	 }
	
	public float getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getIsSalary() {
		return isSalary;
	}
	public void setIsSalary(String isSalary) {
		this.isSalary = isSalary;
	}
	
	
	void WithDraw()
	{
		
		
		
	}
	
	void Deposit()
	{
		
		
		
		
	}

}


class BankaccList{
	
	public static void main(String[] args) {
		
		SavingAccount s1=new SavingAccount(2559,103,"Navin", "Salray");

		SavingAccount s2=new SavingAccount(7859,101,"Pavan", "Salray");

		SavingAccount s3=new SavingAccount(5559,101,"Venky", "Salray");

		SavingAccount s4=new SavingAccount(3659,104,"Ashish", "Salray");
		
		
		TreeSet<SavingAccount> t=new TreeSet<SavingAccount>(new MyComparator());
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		
		System.out.println(t);
		
	}
	
}

class MyComparator implements Comparator

{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if (i1>i2)
		{
			
			return -1;
		}
		else if(i1<i2)
		{
			return 1;
			
		}
		else if(i1==i2)
		{
			
			
		}
		return i1;
	}
	
}





	
	
	
	
	
