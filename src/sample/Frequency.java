package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(10,10,20,10,20,10,10));
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		int fre=0, maxFre;
		for(int i:al)
		{
			fre=Collections.frequency(al, i);
			map.put(i, fre);
		}
		int maxValueMap=Collections.max(map.values());
		System.out.println(fre);
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
			if(entry.getValue()==maxValueMap)
				System.out.println("Maximum value is:"+entry.getKey()+":"+entry.getValue());
		}
		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		map1=(HashMap<Integer, Integer>) map.clone();
		System.out.println(map1);
		String s="Abc";
		s=s.concat("def");
		System.out.println(s);
			
	}

}
