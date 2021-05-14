package Collections;
import java.util.*;

public class Parked_Owner_Deatils {
	String owerName;
	String carModel;
	int    carNo;
	String   owerMobileNo;
	String owerAddress;
	
	public Parked_Owner_Deatils(String owerName, String carModel, int carNo, String owerMobileNo, String owerAddress) {
		
		this.owerName = owerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.owerMobileNo = owerMobileNo;
		this.owerAddress = owerAddress;
	}
	
	
	public String toString()
	 {
		 
		 return  owerName+"|"+carModel+"|"+carNo+"|"+owerMobileNo+"|"+owerAddress;
	 }


	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getOwerMobileNo() {
		return owerMobileNo;
	}

	public void setOwerMobileNo(String owerMobileNo) {
		this.owerMobileNo = owerMobileNo;
	}

	public String getOwerAddress() {
		return owerAddress;
	}

	public void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}


	public void remove() {
		// TODO Auto-generated method stub
		
	}
		

}

class Parked_Car_Owner_List
{  
	

	static Parked_Owner_Deatils p1= new Parked_Owner_Deatils("Navin", "BMWW", 1717, "9579118286", "1717 f2 group vidi gharkul solapur");
	static Parked_Owner_Deatils p2= new Parked_Owner_Deatils("Pavan", "Audi", 1878, "9372356525", "1818 f3 group vidi gharkul solapur");
	static Parked_Owner_Deatils p3= new Parked_Owner_Deatils("Venky", "Maruthi", 1978, "8459950230", "1898 f7 group sagar choak solapur");
	static Parked_Owner_Deatils p4= new Parked_Owner_Deatils("Ashish", "Bugati", 1277, "8284829829", "1838 f4 group yallmadir solapur");
     
	  

	
	  static TreeMap<Integer,Parked_Owner_Deatils> h= new TreeMap<Integer,Parked_Owner_Deatils>();
	  
	
	static int add_new_car(Parked_Owner_Deatils obj)
	{
		
		
		h.put(100, p1);
		h.put(102, p2);
		h.put(103, p3);
		h.put(104, p4);
		
		
		

		
		
		System.out.println(h);
		return 0;
		
		
		
	}
	
	 public static  Object remove1(int n)
	 {
		 
		 h.remove(n);
		 
		 System.out.println(h);
		return h; 
		 
	   
	   
		   
	 }
	 
	 public static Object Get_owner_information(int token)
	 {
		 
		 
		 System.out.println(h.get(token));
		
		 return h.get(token);
		 
	 }
	 
	

	
	public static void main(String[] args) {
		
		add_new_car(p1);
		
		remove1(102);
		
		Get_owner_information(104);
		
		
	
		
	}



}





