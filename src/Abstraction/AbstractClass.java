package Abstraction;

abstract class AbstractClass 
{
	//Regular method
	public void method1()
	{
		System.out.println("Hello");
	}
	
	abstract void checkBalance();
	
}


/*
 *Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces


Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:


------------------------------------------------------------------------------------------------------


. Abstarction----to hide the sensitive data and show only essentioal information--


Two ways--
1. Abstract class
2. Interface




we cant create onkect         we dont have body
abstarct  class----         abstarct method

*/

