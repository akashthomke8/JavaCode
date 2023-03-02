package EXAMPLES;

public class DecendingOrder 
{
	public void Decending()
	{
		int x[]= {77,44,99,88,66,22,11,33};
		int tem;
		
		System.out.println("Decending Order");
		for(int i=0; i<x.length; i++)
		{
			for(int j=i+1; j<x.length; j++)
			{
				if(x[i]<x[j])
				{
					tem=x[i];
					x[i]=x[j];
					x[j]=tem;
				}
			}
		}
		
		for(int p:x)
		{
		System.out.println(p);
		}
		
	}
	
	public void Asending()
	{
		int z[]= {76,87,44,98,54,34,56,01,58};
		int tmp;
		
		System.out.println("Asending Order");
		
		for(int i=0; i<z.length; i++)
		{
			for(int j=i+1; j<z.length; j++)
			{
				if(z[i]>z[j])
				{
					tmp=z[i];
					z[i]=z[j];
					z[j]=tmp;
				}
			}
		}
		/*for(int i=0; i<z.length; i++)
		{
			System.out.println(z);
			
		}*/
		for(int k:z)
		{
			System.out.println(k);
		}
	}
	public static void main(String[] args) 
	{
		DecendingOrder obj=new DecendingOrder();
		
		obj.Decending();
		obj.Asending();
		

	}

}
