/*
Program: Creating a item to store in cart
@author: krishna yadav 
@Date: 20 sep 2022
*/

class Item
{
	//instance variable
	private String name;
	private int qty;
	private double totalPrice;
	
	Item()// no arg constructor
	{
		
	}
	
	//paramaterized constructor
	Item(String name, int qty, double unitPrice)
	{
		this.name=name;
		this.qty=qty;
		this.totalPrice= qty* unitPrice;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	
	public int getQty()
	{
		return this.qty;
	}
	
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice=totalPrice;
	}
	
	public double getTotalPrice()
	{
		return this.totalPrice;
	}
	
}