/*
 Program: 
 @author: Krishna yadav
 @Date: 9 sep 2022
*/

class TakeAdmission
{
	  public static void main(String args[])
	{
		float totalmarks=Float.parseFloat(args[0]);
		float pcmmarks=Float.parseFloat(args[1]);
		if(totalMarks>75)// nested if
		{
			if(pcmMarks>85)
				System.out.println("---You are eligible for our college(B.tech)----");
			else
				System.out.println("---You are eligible for our college(BCA)----");
				
		}
		else
			System.out.println("---You are not eligible for our college---------");
		    System.out.println("---Thank You !----");
		
		
	}	
	
	
}


