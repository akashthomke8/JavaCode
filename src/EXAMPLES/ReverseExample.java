package EXAMPLES;

public class ReverseExample 
{
	
	public static void Revers()
	{
		String str="ABCDEFG";
		String retur="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			
			retur=retur+str.charAt(i);
		}
		System.out.println(retur);
	}
	
	public static void Revers1()
	{
		String rev="Revers The String";
		String result="";
		
		for(int j=rev.length()-1; j>=0; j--)
		{
			result=result+rev.charAt(j);
	
		}
		System.out.println(result);
	}
	
	public static void main(String[] args)
	{
		
		Revers();
		Revers1();
	}
}

//OutPut === GFEDCBA
//OutPut === gnirtS ehT sreveR