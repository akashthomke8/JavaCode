package EXAMPLES;
import java.util.ArrayList;

public class SeparatelowerCaseUpperCase
{

	public static void main(String[] args)
	{
		
			String s="AKASHjhcfvdhg";
			
			ArrayList<Character> A1=new ArrayList<Character>();
			ArrayList<Character> A2=new ArrayList<Character>();
			
			
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
					A2.add(s.charAt(i));
				}
				else
				{
					A1.add(s.charAt(i));
				}			
			}
			for(char q:A2)
			{
				System.out.println("   "+q);
			}

			for(char p:A1)
			{
				System.out.println(p);
			}
			
	}

}
/*
 OutPut===
   A
   K
   A
   S
   H
j
h
c
f
v
d
h
g
*/
