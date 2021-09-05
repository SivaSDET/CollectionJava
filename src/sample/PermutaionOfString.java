package sample;

import java.util.ArrayList;
public class PermutaionOfString {
	static ArrayList<String> li=new ArrayList<String>();
	public static void main(String[] args) {
		String str="siva";
		printPermutaion(str, "");
		System.out.println("AAAA"+str.substring(3));
		System.out.println(li);
		System.out.println("Size:"+li.size());

	}
	public static void printPermutaion(String s, String ans)
	{
		if(s.length()==0)
		{
			li.add(ans);
		}
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String ros=s.substring(0, i)+s.substring(i+1);
			printPermutaion(ros, ans+ch);
		}
	}

}
