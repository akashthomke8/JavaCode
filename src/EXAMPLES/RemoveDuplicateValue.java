package EXAMPLES;

import java.util.LinkedHashSet;

public class RemoveDuplicateValue
{

	public static void main(String[]args)
	{
		String z="hhhhggggjjjjytnbbbvhhgg";
		char ch[]=z.toCharArray();
		
		LinkedHashSet<Character> obj=new LinkedHashSet<Character>();
		
		for(char i=0; i<ch.length; i++)
		{
			obj.add(ch[i]);
		}
		
		System.out.println(obj);
	}

}
//OutPut === [h, g, j, y, t, n, b, v]