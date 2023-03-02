package CollectionJava;

import java.util.HashSet;

public class HasSetDemo 
{
/*
	Set ---Interface
	HashSet ---Class

 	HashSet-   i) Not Allow Duplicate
			  ii) Sequence is not Fix
	 		 iii) HashSet --It con contain a single null values.
*/
	public static void main(String[] args)
	{
		HashSet<Integer> obj=new HashSet<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		
		System.out.println(obj); //[50, 20, 40, 10, 30] Display the HashSet Elements
		
		obj.remove(30);
		System.out.println(obj); //[50, 20, 40, 10]     Remove the Element from HashSet
				
		System.out.println(obj.contains(40)); //Output- true  booleans value are available are not true ou false
		
		//for each loop
		for(int xyz:obj)
		{
			System.out.println(xyz);
		}
	}

}
