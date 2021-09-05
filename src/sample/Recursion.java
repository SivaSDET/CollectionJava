package sample;

public class Recursion {
	static int n1=0, n2=1, n3;
	public static void main(String[] args) {
		Recursion obj=new Recursion();
		int factorial=obj.fact(3);
		System.out.println(factorial);
		System.out.println("************");
		int n1=0, n2=1,n3, count=5;
		System.out.print(n1+" "+n2);
		obj.fib(count-2);
		System.out.println("\n************");
		obj.rev("raj");

	}
	
	private void rev(String str) {
		if( (str== null) || (str.length()<=1))
		{
			System.out.println(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));
			rev(str.substring(0, str.length()-1));
		}
		
	}

	public int fact(int num)
	{
		if(num>0)
			return num*fact(num-1);
		else
			return 1;
	}
	public void fib(int count)
	{
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fib(count-1);
		}
	}

}
