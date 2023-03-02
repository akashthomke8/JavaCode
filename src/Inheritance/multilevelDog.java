package Inheritance;

public class multilevelDog extends multilevelAnimal			///multilevelDog parent
{
	public void method2()
	{
		System.out.println("Method 2 --Run->");
	}
	
	public static void main(String[]args)
	{
		multilevelDog obj=new multilevelDog();
		
		obj.method1();
		obj.method2();
		
	}


}
