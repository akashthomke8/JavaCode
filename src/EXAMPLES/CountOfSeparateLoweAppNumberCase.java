package EXAMPLES;

public class CountOfSeparateLoweAppNumberCase 
{
		//Count Of Saparate LowerCAse ApperCase Number And Specile Symbol
	
	public static void main(String[] args) 
	{
		String pp="Akash@123";
		
		int apperCase=0;
		int lowerCase=0;
		int number=0;
		int specialSymbol=0;
			
		for(int i=0; i<pp.length(); i++)
		{
			if(pp.charAt(i)>='A' && pp.charAt(i)<='Z')
			{
				apperCase++;
			}
			else if(pp.charAt(i)>'a' && pp.charAt(i)<'z')
			{
				lowerCase++;
			}
			else if(pp.charAt(i)>'0' && pp.charAt(i)<'9')
			{
				number++;
			}
			else
			{
				specialSymbol++;
			}
		}
		
		System.out.println("Apper Case ="+apperCase);
		System.out.println("Lower Case ="+lowerCase);
		System.out.println("Number Count ="+number);
		System.out.println("Special Symbol ="+specialSymbol);
	}
}

/*
 OutPut ===
Apper Case =1
Lower Case =3
Number Count =3
Special Symbol =2
*/
