package day01022026.methodesOfReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ExempleAvecMethodeStatic {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(2);
		list.add(10);
		list.add(3);
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println(list);
		
		// Implémentation d'une interface fonctionnelle via une expression lambda
		Consumer<List<Integer>> consumer = (List<Integer> listInt)->Collections.sort(listInt);
		
		// Implémentation d'une interface fonctionnelle via une méthode de référence static
		//Consumer<List<Integer>> consumer = Collections::sort;
		
		consumer.accept(list);
		System.out.println(list);

	}

}
