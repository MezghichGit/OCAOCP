package day08022026.LesCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LesList {

	public static void main(String[] args) {
		
		List<Integer> nombresAL = new ArrayList<>();
		List<Integer> nombresLL = new LinkedList<>();
		
		nombresAL.add(12);
		nombresAL.add(20);
		nombresAL.add(20);
		nombresAL.add(3);
		System.out.println(nombresAL);
		nombresAL.removeIf(x->x==20);
		System.out.println(nombresAL);
		/*
		nombresLL.add(12);
		nombresLL.add(20);
		nombresLL.add(3);
		System.out.println(nombresLL);
		System.out.println(nombresAL.isEmpty());
		System.out.println(nombresAL.size());
		System.out.println(nombresAL.contains(20));
		System.out.println(nombresAL);
		System.out.println(nombresAL.remove(new Integer(20)));
		System.out.println(nombresAL);
		System.out.println(nombresAL.remove(0));
		System.out.println(nombresAL);*/
	}

}
