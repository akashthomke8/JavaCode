package CollectionJava;

import java.util.ArrayList;

public class ArrayListDemo {
	/*		
	 
	 	What is Collection :-
				-Collection is a framework provides architecture to store and manipulate the group of objects.
	 
	 			-Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion,
	 			manipulation, and deletion.
	 
	 	-Interface ---Interface = Extends.
	 	-Interface ---Class		= Impliments.
	 
	 
	 	ArrayList- i) Duplicated are Allowed
	 			  ii) Sequence is Fix 
	 			 iii) ArrayList--- Multiple Null Values are Allowed.
	 			  
	 			  
	 	Null Values --->
		 			i) ArrayList--- Multiple Null Values are Allowed.
		 		   ii) HashSet ---  It con contain a single null values.
		 		  iii) HashMap ---  It can contain a single null key and multiple null values.
		 		  
	 		  
	 	List ---InterFace
	 	ArrayList --Class
	 
	  */

	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		
		obj.add(10); //0
		obj.add(20); //1
		obj.add(30); //2
		obj.add(40); //3
		obj.add(30); //4
		obj.add(60); //5
		
		System.out.println(obj); //OutPut- [10,20,30,40,30] 	Print The arrayList.
		System.out.println(obj.size()); //Output- 6 			Size of ArrayList.
		System.out.println(obj.get(3));	//Output- 40			This will get value from specific Index.
		obj.add(1, 88);										
		System.out.println(obj);//Output- [10, 88, 20, 30, 40, 30]	 Insert the value at specific Index
		obj.set(4, 90);
		System.out.println(obj);//OutPut-[10, 88, 20, 30, 90, 30]    Replace the value at specific Index.
		obj.remove(0);										
		System.out.println(obj);//OutPu- [88, 20, 30, 90, 30]	To remove the value at specific Index
		System.out.println(obj.contains(60)); //OutPut-true 	This will check if specifid element is available in list or not
		//obj.clear();
		//System.out.println(obj); //OutPut- []					To Clear the List
		
		//Different types of way to Display the ArrayList
		System.out.println(obj); // 1st Way
		// Output- [88, 20, 30, 90, 30, 60]
		
		for(int zz:obj) 		//2nd Way		Thourght the for each loop
		{
			System.out.println(zz);
		}
		/*Output- 
		88
		20
		30
		90
		30
		60*/
		
		for(int i=0; i<obj.size(); i++)	//3rd Way   Thourght the for loop
		{
			System.out.println(obj.get(i));
		}
		/*Output- 
		88
		20
		30
		90
		30
		60*/
		
	}

}
