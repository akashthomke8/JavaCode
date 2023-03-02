package Abstraction;

public class InterfaceDemo implements Interface
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hiii interface method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("HEllo Method2");
	}
	
	public static void main(String[]args)
	{
		InterfaceDemo obj=new InterfaceDemo();
		
		obj.method1();
		obj.method2();
		
	}
	
}
/**Notes on Interfaces:
Like abstract classes, ---> 1) interfaces cannot be used to create objects 
2)Interface methods do not have a body - the body is provided by the "implements" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract

Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)

If we want to extend one interface by another then need to use extends keyword


Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can
   be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple 
   interfaces, separate them with a comma */
 