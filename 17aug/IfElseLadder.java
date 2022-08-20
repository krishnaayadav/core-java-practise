class IfElseLadder
{
    public static void main(String args[])
	{
	  int marks= Integer.parseInt(args [0]);
	  char grade;
	  
	  if(marks>90)
		  grade='A';
	  else if(marks>80)
		  grade='B';
	       else if(marks>60)
			   grade='C';
		      else if(marks>40)
				  grade='D';
			     else 
					 grade='F';
				 
				 
	if (grade=='F')
     System.out.println("YOU HAVE FAILED");
    else
	{
          System.out.println("you have passed with grade:" +grade);
	}
	
	
	}
}



