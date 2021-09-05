package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombineArray {

	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> al2=new ArrayList<Integer>(Arrays.asList(4,5));
//		al1.addAll(al2);
//		System.out.println(al1);
//		al1.addAll(2, al2);
//		System.out.println(al1);
//		al1.addAll(al1);
//		System.out.println(al1);
//		al1.clear();
//		System.out.println(al1);
		
		//clone
		ArrayList<Integer> clone_list=(ArrayList<Integer>)al1.clone();
		System.out.println(clone_list);
		System.out.println(clone_list.contains(1));
		System.out.println(clone_list.contains("1"));
		int position=al1.indexOf(9);
		System.out.println(position);
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("Raj","kumar","Aswath", "Raj"));
		int last_index=list.lastIndexOf("Raj");
		System.out.println(last_index);
		list.remove(1);
		System.out.println(list);
		list.remove("Raj");
		System.out.println(list);
		al1.remove(1);
		System.out.println(al1);
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> !(num%2==0));
		System.out.println(numbers);
		
		numbers.removeAll(Collections.singleton(2));
		System.out.println(numbers);
		numbers.add(4);
		System.out.println(numbers);
		numbers.retainAll(Collections.singleton(4));
		System.out.println(numbers);
		
		ArrayList<Integer> mainList=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> subList=new ArrayList<Integer> (mainList.subList(3, 8));
		System.out.println(subList);
		
		ArrayList<String> names=new ArrayList<String> (Arrays.asList("Siva", "Tom", "Raj"));
		Object ob[]=names.toArray();
		System.out.println(Arrays.toString(ob));
		
		ArrayList<Integer> mainList1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		mainList1.removeIf(num -> num%2==0 && num<5);
		System.out.println(mainList1);
	}
	

}
