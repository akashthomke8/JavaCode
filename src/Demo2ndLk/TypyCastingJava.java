package Demo2ndLk;

public class TypyCastingJava
{
			 /*  What is Type casting -: Typecasting is nothing but converting one datatype value to another,
			                             datatype value is called Typecasting.  
			                             
			     Implicit Typecasting -: It is automatically performed by the compiler,
			           				     and there is no loss of information  
			           
			     Explicit Typecasting -: It is performe by the programmer ,
			    						 and will be a loss of information.
			     
			             **/
	public static void main(String[] args) 
	{
		 	//widening casting
		
		  int a=12;
		  float f=a;
		  System.out.println(a); //12
		  System.out.println(f); //12.0
		  
		     //widening casting
		  short b=14;
		  float k=b;
		  System.out.println(b); //14
		  System.out.println(k); //14.0
		  
		  	// narrowing 
		  
		  float l=12.2f;
		  int j=(int)l;
		  System.out.println(l);
		  System.out.println(j);
		  
		  double o=12.55;
		  long s=(long)o;
		  System.out.println(s);
		 
		  int ab=130;
		  byte cd=(byte)ab;
		  System.out.println(cd);
		  
		  int x=131;
		  char t=(char)x;
		  System.out.println(t);
		  
		  
		  char hg='A';
		  int as=hg;
		  System.out.println(as);
		  
		  
		  byte test1=120;
		  char test2=(char)test1;
		  System.out.println(test2);
		 
	}

}
