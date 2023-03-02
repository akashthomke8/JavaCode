package CollectionJava;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo
{
		//Dupalicat are not allowed
		//Sequcene are fix
	
	public static void main(String[] args)
	{
		LinkedHashSet<Integer>	obj=new LinkedHashSet<Integer>();	
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(20);
		
		//print to for each loop
		for(int k:obj)
		{
			System.out.println(k);	//OutPut- 10 20 30 40 50	Duplicate are not allowed sequcene are fix
		}
		
		System.out.println(obj);	//OutPut- [10, 20, 30, 40, 50]
		
		
	}

}
