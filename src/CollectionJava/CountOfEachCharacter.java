package CollectionJava;

import java.util.HashMap;

public class CountOfEachCharacter 
{		
	//Important Question Int- Count of each character.

	public static void main(String[] args) 
	{
		
		String s="hellooo";
		
		char ch[]=s.toCharArray();
		
		HashMap<Character,Integer> obj=new HashMap<Character,Integer>();
		
		for(int i=0; i<ch.length; i++)
		{
				if(obj.containsKey(ch[i]))
				{
					obj.put(ch[i],obj.get(ch[i])+1);  			
				}
				else
				{
					obj.put(ch[i], 1);
				}
		
				//System.out.println(obj);
		}
		System.out.println(obj);

	}

}
