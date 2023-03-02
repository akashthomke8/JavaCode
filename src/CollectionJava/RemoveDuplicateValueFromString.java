package CollectionJava;

import java.util.HashSet;

public class RemoveDuplicateValueFromString
{
		    //Important Example :- Remove Duplicate Value From String
	
	public static void main(String[] args)
	{
		   String s="kkkzzzjjj";
		   
		   char ch[]=s.toCharArray();         //This is Using for Seperate the String/Charater
		   
		   HashSet<Character> obj=new HashSet<Character>();
		   
		   for(char v:ch)
		   {
			  obj.add(v);
		   }
		   
		   System.out.println(obj);	           // OutPut-   [z, j, k]
		   
		
	}

		

}
