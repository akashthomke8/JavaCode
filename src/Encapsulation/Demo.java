package Encapsulation;

public class Demo {

		private String name;

		//To update the value      //Rahul
		public void setName(String Newname)
		{
			this.name = Newname;
		}
		
		
		
		 //To access the value
		public String getName()
		{
			return name;
		}

		
		
}



/*
Encapsulation	:---
		The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
		
		declare class variables/attributes as private
		
		provide public get and set methods to access and update the value of a private variable




 * Better control of class attributes and methods Class attributes can be made
 * read-only (if you only use the get method), or write-only (if you only use
 * the set method) Flexible: the programmer can change one part of the code
 * without affecting other parts Increased security of data
 
 
 
 
 */




