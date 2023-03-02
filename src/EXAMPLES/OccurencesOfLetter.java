package EXAMPLES;

public class OccurencesOfLetter
{
			//Occurences    of    Letter
	
	public static void main(String[] args)
	{
		
		String str="Success Is No Accident";
		int cnt=0;
		
			for(int i=0; i<str.length(); i++)
			{
					if(str.charAt(i)=='c')
					{
						cnt++;
					}
			}
			System.out.println(cnt);
	}
}
