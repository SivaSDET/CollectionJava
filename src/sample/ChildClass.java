package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ChildClass implements InterfaceA{
	@Override
	public void method1() {
		System.out.println("Method1");
		
	}

	@Override
	public String method2() {
		System.out.println("Method2");
		return null;
	}
	public static void main(String[] args) throws IOException {
		String str="sivarajakumar";
		permString(str);
	} 
	public static void permString(String str)
	{
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("OS", 78);
		map.put("DBMS",28);
		map.put("Computer Network", 67);
		map.put("Java",90);
		
		List<Map.Entry<String, Integer>> list=new LinkedList<Map.Entry<String, Integer>> (map.entrySet());
		Collections.sort(list, (i1,i2) -> i1.getValue().compareTo(i2.getValue()));
		HashMap<String, Integer> map1=new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> en: list)
			map1.put(en.getKey(), en.getValue());
		for(Map.Entry<String, Integer> en:map1.entrySet())
			System.out.println(en.getKey()+"                  :"+ en.getValue());
	}
	// function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        /*// Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });*/
        Collections.sort(list, (i1,i2) -> i1.getValue().compareTo(i2.getValue()));
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
            
	}

}
