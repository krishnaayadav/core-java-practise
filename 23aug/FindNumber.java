class FindNumber
{
  static void checkArray( int searchNum)
  {
   int[] num= {12,12,78,45,56};
   boolean found = false;
   
   for(int i=0;i<num.length;i++) {
   if (searchNum==num[i]) {
     found = true;
	 break;
	 }
	 }
	 if (found)
	 System.out.println(searchNum +" is found");
	  else
	   System.out.println(searchNum +"is not found");
	   }
	   public static void main (String args[])
	   {
	     checkArray(Integer.parseInt(args[0]));
		 }
}