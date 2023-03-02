package Demo2ndLk;

public class OperatorsInJAva 
{

	public static void main(String[] args) 
	{
		
		///Arithmatic Operators +,-,%,*,/,--,Increment Decrement
		//assignment-- =
		//comprasion-
		//logical operator
		
		System.out.println("Addition");
		int a=40;
		int b=20;
		int result1=a+b;
		System.out.println(result1);
		
		System.out.println("Subtraction");
		int c=23;
		int d=68;
		int result2=c-d;
		System.out.println(result2);
		
		System.out.println("Dividation");
		int e=85;
		int f=20;
		float result3=e/f;
		System.out.println(result3);
		
		System.out.println("Multiplication");
		short mult=2;
		short mult1=8;
		byte result4=(byte)(mult*mult1);
		System.out.println(result4);
		
		System.out.println("Modules");
		double dl=87;
		double dl1=19;
		float result5=(float)(dl%dl1);
		System.out.println(result5);
		
		//comprasion---   <,>,<=,>=,==,!=
		
		int x=20;
		
		System.out.println("Comparison operator");
		
		System.out.println(x<20);		//Less than                //false
		System.out.println(x>20);		//Greater than  		   //false
		System.out.println(x<=20);		//Less than or equal to	   //true
		System.out.println(x>=20);		//Greater than or equal to //true
		System.out.println(x==20);		//Equals to				   //true
		System.out.println(x!=20);		//Not equal to			   //false
		
		
		System.out.println("Logical Operator");
		
			/* logical operator
			
					AND=== && ---> If both statement are true it will returns true.
					OR===  || ---> IF one of the statement are true it will returns true.
					NOT=== !  ---> Reverse the result.
			
			*/
		
		int y=10;
		
		System.out.println(y<30&&y>10);     //false
		System.out.println(y<30||y>10);	    //true
		System.out.println(y<30||y>=10);    //true
		System.out.println(y<30&&y>=10);    //true
		System.out.println(!(y<30||y>=10)); //false
	}
}

