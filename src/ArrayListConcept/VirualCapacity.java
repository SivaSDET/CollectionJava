package ArrayListConcept;

import java.util.ArrayList;

public class VirualCapacity {

	public static void main(String[] args) {
		ArrayList<Object> ar=new ArrayList<Object> (20);
		System.out.println(ar.size());
		ar.add(100);
		System.out.println(ar.size());
		ar.add(200);
		ar.add(400);
		ar.add(200);
		ar.add(400);
		ar.add(200);
		ar.add(400);
		ar.add(200);
		ar.add(400);
		ar.add(200);
		ar.add(400);
		ar.add(200);
		ar.add(400);
		ar.add(200);
		ar.add(400);
		ar.add(200);
		ar.add(400);
		

	}

}
