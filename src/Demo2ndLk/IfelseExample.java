package Demo2ndLk;

public class IfelseExample 
{

	public static void main(String[] args)
	{
		///the position of employee in the company using the salary.
		
		int sal=5000;
		
		if(sal<=1000)
		{
			System.out.println("Worker");
		}
		else if(sal<=3000)
		{
			System.out.println("Jr Employee");
		}
		else if(sal<=5000)
		{
			System.out.println("Sr Employee");
		}
		else if(sal<7000)
		{
			System.out.println("Dr");
		}
		else
		{
			System.out.println("CEO");
		}
	}

}
