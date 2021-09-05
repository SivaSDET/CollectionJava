package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListWithOtherClass {

	public static void main(String[] args) {
		
		int n[]= {1,2,3,4};
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		for(int i:n)
			li.add(i);
		int max=li.size()-1;
		System.out.println(li.get(max));
		
		

	}

}
