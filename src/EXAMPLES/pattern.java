package EXAMPLES;

public class pattern {

	public static void main(String[] args) 
	{
		pattern1();
		pattern2();
		pattern3();
	}
	
	
	public static void pattern1()
	{
														System.out.println("pattern1-->");
		for(int i=0; i<=3; i++ )
		{
			for(int j=0; j<=3; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2()
	{
														System.out.println("pattern2-->");
		 for (int i = 0; i <= 4; i++)//outer for loop
		 {  
			   for (int j = 0; j <= i; j++) //inner for loop
			   { 
				   System.out.print("*" + " ");
			   }
		 System.out.println();							//This will shift control to next row
		}
	}
	
	
	public static void pattern3()
	{
														System.out.println("pattern3--->");
		for(int i=0; i<=5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}








