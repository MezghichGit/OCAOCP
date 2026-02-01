package day01022026.methodesOfReference;

import java.util.function.Predicate;

public class MRF_SansInstance {

	public static void main(String[] args) {
		
		//1) implémentation par une expression Lambda verbose
		Predicate<String> verifEmpty = (String s)->{return s.isEmpty();};
		
		String temp = "";
		String ch = "OCP";
		System.out.println(verifEmpty.test(temp));
		System.out.println(verifEmpty.test(ch));
		
		// 2)Implémentation par une méthode de référence sans connaitre l'instance à l'avance
		Predicate<String> filter = String::isEmpty;
		
		System.out.println(filter.test(temp));
		System.out.println(filter.test(ch));
		
	}

}
