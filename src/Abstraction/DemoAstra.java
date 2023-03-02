package Abstraction;

public class DemoAstra extends AbstractClass 
{
	
		void checkBalance()
		{
			System.out.println("Check Balance");
		}
		
		public static void main(String[] args)
		{
			DemoAstra obj=new DemoAstra();
			obj.method1();
			obj.checkBalance();
		}

		
		
}
