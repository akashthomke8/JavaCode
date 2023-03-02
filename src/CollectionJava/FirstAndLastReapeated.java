package CollectionJava;

import java.util.HashMap;

public class FirstAndLastReapeated
{
		//Find First And Last Reapeated Element

	public static void main(String[] args) 
	{
		String p="aabbbccd";    
		
		char ch[]=p.toCharArray();
		HashMap<Character,Integer> obj=new HashMap<Character,Integer>();
		
		for(int i=0; i<ch.length; i++)
		{
			if(obj.containsKey(ch[i]))
			{
				obj.put(ch[i],obj.get(ch[i])+1);
			}else
			{
				obj.put(ch[i], 1);
			}
		}
		System.out.println(obj); 
		
				//OutPut---   {a=2, b=3, c=2, d=1}
		
		for(char x:ch)
		{
			if(obj.get(x)==1)
			{
				System.out.println("First Non-Repeated "+ x);
				break;
			}
		}
		
		for(char y:ch)
		{
			if(obj.get(y)>1)
			{
				System.out.println("First Repeated "+y);
				break;
			}
		}	
	}
}
