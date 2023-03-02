package EXAMPLES;

public class DuplicateNumber
{

	public static void main(String[] args) 
	{
		int x[]= {88,77,88,77,88,77};
		int temp=0;
		
		for(int i=0; i<x.length; i++)
		{
			for(int j=i+1; j<x.length; j++)
			{
				if(x[i]==x[j])
				{
					temp=x[i];
					System.out.println(temp);
				}
			}
		}
	}
}
