package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("Siva");
		name.add("raj");
		name.add("kumar");
		name.add("Tom");
	
		
		//typical for loop
		for(int i=0;i<name.size();i++)
		{
			System.out.println(name.get(i));
		}
		System.out.println("____");
		//for-each loop
		for(String n:name)
			System.out.println(n);
		System.out.println("____");
		//JDK 8 lambda
		name.stream().forEach(ele -> System.out.println(ele));
		System.out.println("____");
		//iterator
		Iterator<String> it=name.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
