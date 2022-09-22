/*
Program: Creating a testing cart 
@author: krishna yadav 
@Date: 20 sep 2022
*/



class TestCart
{
	public static void main(String ...args)
	{
		//----Constructor injection-------//
		Item dal = new Item ("Tur Daal",3,110);
		Item mobile= new Item("Samsung",1, 16000);
		Item chocolate = new Item("Dairy Milk", 5,10);
		Item book = new Item("Maths",3,140);
		Item chips= new Item("lays",2,20);
		
		ShoppingCart myCart= new ShoppingCart();
		
		myCart.addItem(dal);
		myCart.addItem(mobile);
		myCart.addItem(chocolate);
		myCart.addItem(book);
		myCart.addItem(chips);
		
		System.out.println("-------------------");
		
		System.out.println("Bill Amount :"+myCart.calculateBill());
		System.out.println("-------------------");
		
		
	}
	
	
}