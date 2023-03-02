package Demo2ndLk;


public class StringReverse
{

	public static void main(String[] args) 
	{
		String s="Rahul";
		String temp="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			
			temp=temp+s.charAt(i);
			
			///2nd- output  System.out.println(temp);
		}
		/*1St- output */ System.out.println(temp);
		
		string();
		
		StringReverse obj=new StringReverse();
		obj.reverse();
		
	}
	
	
	public static void string()
	{
		String var="Akash";
		
		System.out.println(var.charAt(2));
	}
	
	public void reverse()
	{
		String r="Repeat";
		String t="";
		
		for(int i=r.length()-1; i>=0; i--)
		{
			t=t+r.charAt(i);
		}
		System.out.println(t);
		
	}

}
// 1st - output--->luhaR

/*
///2nd- output  
l
lu
luh
luha
luhaR */
