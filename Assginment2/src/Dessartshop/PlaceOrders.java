package Dessartshop;

import java.util.Scanner;

public class PlaceOrders {
	
	
	
	String role,item,order;
	int length;
	String str[]= {"candy","cookie","icecreame"};
	void menu() {
		System.out.println(".....Menu.....");
		length=str.length;
		System.out.println("array length"+length);
		for(int i=0;i<length;i++)
		{
			System.out.println(i+1+". "+str[i]+"\n");
		}
	}
	void role()
	{
		System.out.println("Please mention the role\nManager:M for cutomer:C");
		Scanner r=new Scanner(System.in);
		role=r.nextLine();
		if(role.equals("Manager")||role.equals("Customer"))
		{
			System.out.println("Enter desert item in menu");
			Scanner itm=new Scanner(System.in);
			item=itm.nextLine();
			System.out.println(item+" added in menu");
//			for(int j=length;j<=length;j++)
//			{
//				str[j]=item;
//			}
		}
		else
		{
			System.out.println("Place your order");
			Scanner or=new Scanner(System.in);
			order=or.nextLine();
		}
		
	}
	public static void main(String[] args) {
		PlaceOrders ord=new PlaceOrders();
		Candy1 cnd=new Candy1();
		Cookie ck=new Cookie();
		IceCream ice=new IceCream();
		ord.menu();
		ord.role();
		if(ord.order.equals("candy"))
		{
			cnd.getCost();
		}
		else if(ord.order.equals("cookie"))
		{
			ck.getCost();
		}
		else {
			ice.getCost();
		}
		
	}

}