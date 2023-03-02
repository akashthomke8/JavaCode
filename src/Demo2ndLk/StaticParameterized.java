package Demo2ndLk;

public class StaticParameterized
{
	//Non-static method --we need object to call non-static method  
	public void method1()
	{
		System.out.println("Hello we need object to call the nonStatic method ");
	}
	//Static method---we dont need object to call static method
	public static void method2() 
	{
		System.out.println("Hello WhenWeDecleardSTATIC ThenWe dont need the object to call static method");
	}
	
	//Parameterized method---
	public static void method3(String a, String b)
	{
		System.out.println(a+b);
	}
	
	//method with int return type-
	public int mathod4()
	{
		int a=5;
		return a;
	}
	
	//////main method---
	public static void  main(String[]args)
	{
			//we need to create object of class
			//classname  obj=new classname();
			StaticParameterized obj=new StaticParameterized(); ///we have to created object here
			
			obj.method1();
			
			method2();
			
			method3("Akash","Shatanu");
		
			System.out.println(obj.mathod4());
	}
}
