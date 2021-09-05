package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		List<String> li=Collections.synchronizedList(new ArrayList<String> (Arrays.asList("Raj","kumar")));
		
		synchronized(li)
		{
			for(String s:li)
				System.out.println(s);
		}
	
		//2. 
		CopyOnWriteArrayList<Integer> num=new CopyOnWriteArrayList<Integer>(Arrays.asList(1,2,3,4));
		Iterator<Integer> it=num.iterator();
		while(it.hasNext())
			System.out.print(it.next()+"     ");
		if(System.out.printf("\nhi")==null)
		{
			
		}
		if(System.out.append("\nHi")==null){
		}
		

	}

}
