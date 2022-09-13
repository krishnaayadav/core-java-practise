/*
 Program: 
 @author: Krishna yadav
 @Date: 9 sep 2022
*/

class Admission
{
	  public static void main(String args[])
	{
		float totalMarks=Float.parseFloat(args[0]);
		float pcmMarks=Float.parseFloat(args[1]);
		if(totalMarks>75)
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