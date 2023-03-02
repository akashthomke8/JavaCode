package EXAMPLES;

import java.util.Arrays;

import Demo2ndLk.Array;

public class SeparateThevalues {

	public static void main(String[] args) 
	{
		int x[]= {8,5,8,5,8,5,8,5,8,5,8,5,8,5,8,5};
		int cnt=0;
		
		 for (int i=0; i<x.length; i++)
		 {
			 if(x[i]==5) 
			 {
				 cnt++;
			 }
		 }
		 for(int i=0; i<x.length; i++)
		 {
			 x[i]=5;
		 }
		 for(int i=cnt; i<x.length; i++)
		 {
			 x[i]=8;
		 }
		 System.out.println(Arrays.toString(x));
	}

}
//OutPut=== [5, 5, 5, 5, 5, 5, 5, 5, 8, 8, 8, 8, 8, 8, 8, 8]