package ExceptionHandling;

public class finallyDemo
{

	 public static void main(String[] args) 
	 {

	  try
	  {
		   int a[] = { 10, 20, 30, 40 };
		   System.out.println(a[5]);
	  }
	  catch(Exception  e) 
	  {
		  	System.out.println("Please try to access value with array range");
	   }
	  
	  finally
	  {
		  	System.out.println("i will execute always ");
	  }

	  		System.out.println("hello1");
	  }
	

}
