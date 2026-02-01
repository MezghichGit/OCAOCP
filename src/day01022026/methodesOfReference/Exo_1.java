package day01022026.methodesOfReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exo_1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(10);
		list.add(3);
		list.add(4);
		list.add(12);
		Collections.sort(list);
		System.out.println(list);
		// binarySearch : nécessite que la liste soit triée
		
		SearchValue sv_lambda = (List <Integer>temp, int a)->{
			return Collections.binarySearch(temp, a);
		};
			System.out.println(sv_lambda.trouve(list,10));
			
		SearchValue sv_reference = Collections::binarySearch;
		
		System.out.println(sv_reference.trouve(list,10));
	}

}
