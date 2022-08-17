/*
PROGRAM: data types in java 
@author: krishna yadav
@date: 16 august 2022 
*/
 class DataTypeDemo
 {
	 public static void main(String args[])
	 {
		 int num1= Integer.parseInt(args[0]); //converting string into int
         int num2= Integer.parseInt(args[1]);
        System.out.println("the result is:" +(num1+num2)); //runtime exception
		
		
		 
		 //float
		 float f1= 7.9f;
		 float f2= 45f;
		 System.out.println("the result of float is:" + (f1+f2));
		  
		 //char
		 char c1 ='a';
		 System.out.println(c1);
		 
		 
		 
	 }
 }