/*
 Program: EnhancedForDemo
 @author: Krishna yadav
 @Date: 23 august 2022
*/
class EnhancedForDemo
{
  static void ColourName(String colourNames[])
  {
   for(String s : colourNames)
    System.out.println(s);
	}
	public static void main(String args[])
	{ 
	  ColourName(new String[]{"red","green","yellow","blue"});
	  }
	  }