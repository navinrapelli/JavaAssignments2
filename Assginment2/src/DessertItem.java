
abstract  class DessertItem {
	
      private String dessartname;
      private int price;
      private String cuurency;
	
	abstract void getCost();
	
	public void setDessart(String dessartname,int price,String cuurency )
	{
		boolean navin=true;
		
		if(!navin)
		{
			
			System.out.println("u cannot set the dessart");
		}
		
		else
		{

	
		this.dessartname=dessartname;
		
		
		
		}
	}

	public String getDessartname() {
		
		return dessartname;
		
	}

	
	
	

}



