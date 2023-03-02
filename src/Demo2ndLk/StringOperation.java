package Demo2ndLk;

public class StringOperation 
{

	public static void main(String[] args) 
	{
			//length -1			index  -0 
		
		String pr="I love Java";
		System.out.println(pr);
		
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
		
		System.out.println(p+" "+q);
		
		String s="I";
		String t="Am";
		String r="rider";
		System.out.println(s.concat(" "+t+" "+r));
		String z=t+r;
		System.out.println(s.concat(" "+z)); //anther ways
		System.out.println(s.concat(" "+t+" "+r));//anther ways
		System.out.println(s+" "+t+" "+r);//anther ways
		
			//escape operators  ---\
		
		String kr="I \"love\" java ";
		System.out.println(kr);
		
		String jr="I love  \\\\old songs";
		System.out.println(jr);
				
		String tr="We are working @ in mnc";
		System.out.println(tr);
		
			// Hw-- "Hello i love java"
		
		String hw="\"Hello i love java\"";
		System.out.println(hw);
		
			//String trim(); ---> It removes beginning and ending spaces of the string.
		
		String zz="        It remores beginning end spaces of string           ";
		
		System.out.println(zz.trim());
		
		String a1="EqualIgnorCase";
		String a2="equaligonrCase";
		
		System.out.println(a1.equalsIgnoreCase(a2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
