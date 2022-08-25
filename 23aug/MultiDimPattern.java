/*
 Program: MultiDimPattern
 @author: Krishna yadav
 @Date: 23 august 2022
*/
class MultiDimPattern
{
     static void printPattern()
	 {
		 int rows =5;
	     for (int i=1;i<=5;i++)
	   {
	    for (int j=1;j<=i;++j)
		{
		   System.out.print("*");
		}
		    System.out.println();
			}
    }
      public static void main(String args[]) 
		{
	        printPattern();
		}
}