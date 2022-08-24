/*
 Program: MultiDimArray
 @author: Krishna yadav
 @Date: 23 august 2022
*/
class MultiDimArray
{
     static void printValues()
	 {
	     int myArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
		 for(int i=0;i<3;i++)
		 {
		    
			for(int j=0;j<3;j++)
			{
			 System.out.print(myArray[i][j]+" ");
			 }
			 System.out.println();
	     }		 
	 }
	 public static void main(String args[])
	 {
	 printValues();
	 }
}