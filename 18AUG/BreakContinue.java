
/*
Program: Java program to understand break and continue statement 
@author: Krishna yadav
@date: 18 august 2022 
*/

class BreakContinue
{
	//  method to understand break keyword
	static void callBreak() 
	{
		for(int i=0;i<10;i++)
		{
			if(i==6)
			  break;
		  System.out.println(i); // printing the value of i 
		}
		
		
	}
	//  method to understand continue keyword
	static void callContinue() 
	{
		for(int i=0;i<10;i++)
		{
			if(i==6)
		     	continue;
		    System.out.println(i);
		}
		
		
	}
	
	public static void main(String args[])
	{
		callBreak();
	     //callContinue();
		 
	}
	
}