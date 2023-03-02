package CollectionJava;
import java.util.HashMap;
class HashMapDemo 
{
	/*
		Map-Inteface
		HashMap-Class
		
			  i) Duplicate are not allowed
			 ii) sequence is not fix
			iii) HashMap --It can contain a single null key and multiple null values.
	*/

	public static void main(String[] args) 
	{
		
		HashMap<String,String> obj=new HashMap<String,String>();
		
		obj.put("MH", "Mumbai");
		obj.put("KR", "Benlor");
		obj.put("GUJ", "Surat");
		obj.put("MH", "Mumbai");
		
		System.out.println(obj); //Output- {KR=Benlor, MH=Mumbai, GUJ=Surat} 
		
		System.out.println(obj.get("GUJ")); //Output- Surat
		
		//obj.remove("MH"); //Remove
		
		//Print Keys
		for(String x:obj.keySet())
		{
			System.out.println(x);
		}
		/*
		  OutPut Of Keys---
		  KR
     	  MH
		  GUJ
		  */
		
		//print Values
		for(String y:obj.values())
		{
			System.out.println(y);
		}
		/*
		 OutPut Of Values---
			Benlor
			Mumbai
			Surat*/
		
		//print Keys and Values
		for(String k:obj.keySet())
		{
			System.out.println(k+" "+obj.get(k));
		}
		
		/*
		 * OutPut Of Keys Values
		 	KR Benlor
			MH Mumbai
			GUJ Surat ---*/
		
	}

}
