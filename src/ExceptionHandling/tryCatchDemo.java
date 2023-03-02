package ExceptionHandling;

public class tryCatchDemo 
{

	 //Syntax
	 /*try {
	    //  Block of code to try
	  }
	  catch(Exception e) 
	  {      // e' stands for exception, but you can rename it anything you like, however, the data type has to remain 'Exception') The 'e' variable stores an exception-type object in this case.
	         //  Block of code to handle errors
	  }*/


	public static void main(String[] args) 
	{
		  try
		  {
		  int a[]= {10,20,30,40};
		  		System.out.println(a[6]);
		  }
		  catch(Exception  e)
		  {
			  	System.out.println("Please try to access value with array range");
		  }
		  
		 
		  System.out.println("hello1");
		  
	 }

	


		//1. catch block is mandatory or not-  
		//2. can we have multiple try block- --No
		//3. can we have multiple catch blocks--

}
