package Demo2ndLk;

public class MethodsStringJava 
{

	public static void main(String[] args) 
	{
		
			
		   //We FIND Length of string
		String a="I love my village";
		System.out.println(a.length());
				
			//Convert the string in uppercase
		String b="Lucky sir is a good teacher";
		System.out.println(b.toUpperCase());
			//Convert the string in uppercase different ways
		String c="Lucky sir is a good teacher";
		String re=c.toUpperCase();
		System.out.println(re);
				
			//Convert the string in lowercase 
		String d="String CONVERTin lowercase";
		System.out.println(d.toLowerCase());
				
			//This will the charecter at specific index 
		String e="Position of charecter in index";
		System.out.println(e.charAt(4));
				
			//(concatanation means join the strings) IN DIFFERENT WAYS
		String p="Join";
		String q="the";
		System.out.println(p.concat(q));
						
			// trim(); ---> It removes beginning and ending spaces of the string.
		
		String zz="        It remores beginning end spaces of string           ";
		System.out.println(zz.trim());
		
			//equalsIgnoreCase();--->It returns true if characters of both strings are equal, ignoring case otherwise false.
		String a1="EqualIgnorCase";
		String a2="equaligonrCase";
		
		System.out.println(a1.equalsIgnoreCase(a2));
		
			//substring();--->substring is a subset of another String.
		String sub="Akash Thomke Substring";
		System.out.println(sub.substring(4));
			///Output-->h Thomke Substring
		
			//equals();--->If any character is not matched, it returns false. If all characters are matched, it returns true.
		String e1="Equal to Equal";
		String e2="Equal to Equal";
		
		System.out.println(e1.equals(e2));
		   	///Output--->true
		
			//contains()--->method searches the sequence of characters in this string. It returns true if the sequence of char values is found in this string otherwise returns false. 
		String con="Sequence of Characters in string It returns TRUE if sqe is correct";
		System.out.println(con.contains("TRUE if sqe is"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
