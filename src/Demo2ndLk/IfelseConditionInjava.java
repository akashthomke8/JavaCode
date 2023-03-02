package Demo2ndLk;

public class IfelseConditionInjava
{
		/*
		  -Block of code will be executed only when the condition is true othewise it will be skipped

		if(condition){ 
			-This Block of code will be execute when the condition is true
			-------------
			Block of code
			-------------
		}else{
		    -This Block of code will be execute when condition is false
			-------------
			Block of code
			-------------
		}
 ================================================================================
 		
 		if---Else---if---Else
 		
 		if(condition){
 		------------
 		-Block of code will be execute when the condition1 is true
 		------------
 		}else if(condition2){
 		------------
 		-Block of code will be execute when condition1 is false
 		------------
 		}else{
 		------------
 		-Block of code will be execute when condition1 and condition2 is false
 		------------
 		}
		
		 * **/
	public static void main(String[] args) 
	{
		 /*studentMArks> 90-- distinction,  studentmarks>70 <=90 --firstClass,  
		  studentMArks>50 && <=70--second claass, studentMArks<50 --fail*/

		  stude();
		  
		  int studentMarks=60;
		  
		  if(studentMarks>90)
		  {
		   System.out.println("distinction");
		  }
		  else if(studentMarks>70 && studentMarks<=90) 
		  {
		   System.out.println("firstclass");
		  }
		  else if(studentMarks>50 && studentMarks<=70)
		  {
		   System.out.println("second class");
		  }
		  else
		  {
		   System.out.println("failed");
		  } 
		
		
	}

	public static void stude()
	{
		int stud=25;
		
		if(stud==50)
		{
			System.out.println("All are present");
		}
		else if(stud!=50)
		{
			System.out.println("Class are Emety");
		}
		else if(stud>50)
		{
			System.out.println("Class are 50%");
		}
		else
		{
			System.out.println("Class are 10% ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
