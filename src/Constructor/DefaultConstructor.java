package Constructor;

public class DefaultConstructor 
{

	/*
	 -> TYPES OF CONSTRUCTORS :- There are 3 
	 
	 types of constructors :-
		 1. Default Constructors (compiler)
		 2. 0-Argument Constructors (programmer)
		 3. Parametrized Constructors (programmer)
		 
	 1. Default Constructors :-
		 -> Whenever we dont create any constructor in 
		 class, then compiler will always create a constructor 
		 which is known as default constructor
		 -> Default constructors are used to provide the 
		 default values to the objects like 0, null etc 
		 depending on the datatype. */
	 
	
		int a;
		String b;
		boolean c;
		short d;
		double e;
		char ch;
		long lg;
		float fl;
		byte bt;
		
		public static void main(String[]args)
		{
			DefaultConstructor obj=new DefaultConstructor();
			
			System.out.println(obj.a);
			System.out.println(obj.b);
			System.out.println(obj.c);
			System.out.println(obj.d);
			System.out.println(obj.e);
			System.out.println(obj.ch);
			System.out.println(obj.lg);
			System.out.println(obj.fl);
			System.out.println(obj.bt);
			
		}


}
