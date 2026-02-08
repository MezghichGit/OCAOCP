package day08022026.LesCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LesSet {

	public static void main(String[] args) {
		//Set<Integer> set = new HashSet<>();
		Set<Integer> set = new TreeSet<>();
		boolean b1 = set.add(66); // true
		boolean b2 = set.add(10); // true
		boolean b3 = set.add(66); // false
		boolean b4 = set.add(8); // true
		for (Integer integer: set) 
			System.out.print(integer + ","); // 66,8,10,


	}

}
