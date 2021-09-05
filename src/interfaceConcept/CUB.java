package interfaceConcept;

class FirstException extends Exception{
	
}
public class CUB {
	
	public static void main(String args[]) throws FirstException
	{
		int a=5;
		char[] ch= {'1','2'};
		try {
//			int b=5/2;
//			System.out.println(ch[2]);
			throw new FirstException();
		}
		catch(Exception e)
		{
			System.out.println("Excption:"+e.toString());
		}
		finally {
			System.out.println("finally");
		}
	}
	
}
