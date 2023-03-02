package EXAMPLES;

public class maxValue 
{
	
	public static void main(String args[])
	{
		maxValue obj=new maxValue();
		obj.maximumValue();
		obj.minimumValue();
	}
	
	public void maximumValue()
	{
		int a[]= {10,20,30,40,20,50,60,30,5};
		int max=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum value of array ="+ max);
	}
	
	public void minimumValue()
	{
		int x[]= {11,22,33,44,88,77,99};
		
		int mini = 0;
		int i;
		
		i=0;
		while(i<mini)
		{
			if(x[i]<mini)
			{
				mini=x[i];
			}
			i++;
		
		}
		
		System.out.println("Minimum value of array ="+ mini);
	}
}
