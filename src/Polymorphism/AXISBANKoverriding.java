package Polymorphism;

public class AXISBANKoverriding extends BANKoverriding	
{
	public void method1()
	{
		System.out.println("Rate of interest 11");
	}
	public void childmethod()
	{
		System.out.println("Child Method from Axis bank");
	}
	
	public static void main(String[] args)
	{
		//This will call parent and child method except method from parent class which is override method
		//child Reference                 Child object 
		AXISBANKoverriding  obj= new AXISBANKoverriding();
		
		obj.method1();			//child overide method
		obj.parentMethod();		//parent method
		obj.childmethod();		//child
		
		
		
		//This will call only parent method.
		//parent Reference		  parent object
		BANKoverriding	 obj1=new BANKoverriding();
		obj1.method1();			//parent method
		obj1.parentMethod();	//parent method
		
		
		
		//This will call only parent method expecpt override method 	i.e this will call child override method
		//parent Reference 		Child object 
		BANKoverriding obj2=new AXISBANKoverriding(); 
		obj2.method1();			//child overide method
		obj2.parentMethod();	//parent method
		
	}
}
