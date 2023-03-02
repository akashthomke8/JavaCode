package EXAMPLES;

import java.util.Arrays;

public class Separate0and1valuesfromArray 
{
	
	//Separate The 0 and 1 values From array.
	
	public static void main(String[] args) 
	{
		int arr[]= {0,1,0,0,0,1,1,1,1,0,0,0,1};
		int cnt=0;
		
		for(int i=0; i<arr.length; i++ )
		{
			if(arr[i]==0)
			{
				cnt++;
			}
		}
		
		for(int i=0; i<cnt; i++)
		{
			arr[i]=0;
		}
		for(int i=cnt; i<arr.length; i++)
		{
			arr[i]=1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}


//OutPut=== [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1]
