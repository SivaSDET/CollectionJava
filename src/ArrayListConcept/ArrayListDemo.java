package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//dynamic array
		int i[]=new int[4];
		
		ArrayList<Object> ar=new ArrayList<Object> ();
		ar.add(100);
		ar.add("abc");
		ar.add(true);
		ar.add(22.900);
		System.out.println(ar);
		System.out.println("Lowest index:"+ar.get(0));
		int li=ar.size()-1;
		System.out.println("Highest index:"+ar.get(li));
		
	}

}
