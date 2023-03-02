package Constructor;

public class ConstructorDemo
{
	
	 //0-argument constructor
	public ConstructorDemo()
	{
	int x=5;
	System.out.println(x);
	}
	
	 // parameterized
	public ConstructorDemo(int y)
	{
		int z=y;
		System.out.println(z);
	}

	public static void main(String[] args) 
	{
		ConstructorDemo obj=new ConstructorDemo();
		ConstructorDemo obj1=new ConstructorDemo(10);
		
	}

}

/*
  
 * A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
 * Note that the constructor name must match the class name, and it cannot have
 * a return type (like void).
 * 
 * Also note that the constructor is called when the object is created.
 * 
 * All classes have constructors by default: if you do not create a class
 * constructor yourself, Java creates one for you. However, then you are not
 * able to set initial values for object attributes.
 
  
 */