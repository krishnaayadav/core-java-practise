class GradeRule
{
    public static void main(String args[])
	{
	  int marks= Integer.parseInt(args [0]);
	  char grade;
	  
	  if(marks>80)
		  grade='A';
	  else if(marks>=60)
		  grade='B';
	       else if(marks>=50)
			   grade='C';
		      else if(marks>=45)
				  grade='D';
			      else if(marks>=25)
				       grade='E';
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