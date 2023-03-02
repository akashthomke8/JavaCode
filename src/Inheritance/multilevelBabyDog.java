package Inheritance;

public class multilevelBabyDog extends multilevelDog	///multilevelBaby child class
{
	public void method3()
	{
		System.out.println("Hi---Method3--->run--->");
	}
		public static void main(String[]args)
		{
			multilevelBabyDog obj=new multilevelBabyDog();
			
			obj.method1();
			obj.method2();
			obj.method3();
		}
}
