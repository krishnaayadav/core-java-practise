/*
 Program: InputDemo
 @author: Krishna yadav
 @Date: 23 august 2022
*/
import java.util.Scanner;
class InputDemo
{
    public static void main(String args[])
	{ 
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter your name");
      String name = sc.nextLine();
	  System.out.println("Enter your age");
	  int age= sc.nextInt();
	  System.out.println("Enter your marks");
	  float marks= sc.nextFloat();
	  System.out.println("Enter the gender (m for male and f for female:");
	  char gender= sc.next().charAt(0);
	  
	     System.out.println("Enter amy 10 numbers :");
		 int []arr=new int[10];
		 for(int i:arr)
		 {
			 i= sc.nextInt();
		 }
	}
	
}

