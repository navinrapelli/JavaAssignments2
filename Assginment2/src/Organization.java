
public class Organization {

	public static void main(String[] args) {
		
		Organization org=new Organization();
		Employee emp=new Employee();
		Manager man=new Manager();
		Labour lab=new Labour();
		
		man.name="Manager";
		lab.name="Labour";
		/*man.grossalary=20000;
		man.intensive=4000;
		man.intensive=150;
		lab.grossalary=18000;
		lab.intensive=2000;
		lab.overtime=50;*/
	
		man.totalsalary(20000, 5000, 150, "Navin");
		lab.totalsalary(18000, 2000, 50, "Ashish");
		
		
		
		
	}

}
