package EXAMPLES;

public class InterADDi implements InterfaceEx
{

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		int result;
		result=a+b;
		System.out.println("Result of Addition ="+result);
	}
	public void  substraction()
	{
		double x=20.76, y=76.9876;
		float resu;
		resu=(float)(x-y);
		System.out.println("Result of Substraction ="+resu);
	}
	
	public void multiplication() {
		
		int p=89, q=45;
		int ans;
		ans=p*q;
		System.out.println("Result of Multiplication ="+ans);
	}
	@Override
	public void dividation() {
		// TODO Auto-generated method stub
		int s=40, t=20;
		int resu1;
		resu1=s/t;
		System.out.println("Result of Dividation ="+resu1);
	}
	public static void main(String[]args)
	{
		InterADDi obj=new InterADDi();
		obj.addition();
		obj.substraction();
		obj.multiplication();
		obj.dividation();
	}
	
	
}
