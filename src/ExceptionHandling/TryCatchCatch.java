package ExceptionHandling;

public class TryCatchCatch
{
		//Can we have multiple catch block
	
	public static void main(String[] args) 
	{
		try {
			int a[]= {10,20,30,40,50};
			
			System.out.println(a[6]);
			
		}catch(Exception e)
		{
			System.out.println("please try to accesse");
		}
		
		//This will be unreachable block
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please try to access value with array range");
		}

	}

}
