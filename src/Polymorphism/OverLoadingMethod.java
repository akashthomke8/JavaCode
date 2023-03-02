package Polymorphism;
		
/*
 		Method  OverLoadind--->	Same method name with Different parameter.
 		
 		Rules--->
 		1) Count should be Different for same datatype
 		2) Datatype should be Different for same Count
 		3) Sequence should be Different for Same Datatype same Count 
 


		1) Count should be Different for same datatype
					Addition(int a, int b)
					Addition(int c, int d, int e)
		
 		2) Datatype should be Different for same Count
 					Addition(int a, int b)
 					Addition(double c, double d)
 
 		3) Sequence should be Different for Same Datatype same Count 
 					Addition(int a, double b)		
 					Addition(double c, int e)
 */

public class OverLoadingMethod 
{

	public void Addition(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void Addition(double c,double d)
	{
		System.out.println(c+d);
	}
	
	public static void main(String[]args)
	{
		OverLoadingMethod  obj=new  OverLoadingMethod();
		obj.Addition(10, 20);
		obj.Addition(23.98, 78.56);
	}
	
}
