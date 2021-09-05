package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Sample {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("tamil", 98);
		
		map.put("Maths", 56);
		map.put("Scenice", 56);
		map.put("English", 56);
		map.put("Social", 78);
		map.put("Computer", 65);
		List<Map.Entry<String, Integer>> li=new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(li, (i1,i2) -> i1.getValue().compareTo(i2.getValue()));
		System.out.println(li);
		HashMap<String, Integer> map2=new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry:li)
			map2.put(entry.getKey(), entry.getValue());
		for(Map.Entry<String, Integer> entry: map2.entrySet())
			System.out.println(entry.getKey()+"    :"+ entry.getValue());
		List<String> l1=new ArrayList<String>(Arrays.asList("AA","ZZ","SS","EE"));
//		Collections.sort(l1);
//		Collections.reverse(l1);
		Collections.sort(l1, Collections.reverseOrder());
//		Collections.reverse(l1);
		System.out.println(l1);
	}
	public static void printPermutaion(String s, String ans) // ab,""  | b,a | "",ab
	{
		if(s.length()==0)
		{
			System.out.print(ans+" "); // ab | 
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i); //a | b
			String ros=s.substring(0,i)+s.substring(i+1); //b | ""
			printPermutaion(ros, ans+ch);  //b,a | "",ab
		}
		
		
	}
	
	

}
