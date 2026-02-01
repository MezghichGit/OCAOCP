package day01022026.methodesOfReference;

import java.util.function.Predicate;

public class MethodeReference_InstanceMethode {

	public static void main(String[] args) {
		
		String phrase ="formation ocp chez sip academy";
		// Version Lambda
		Predicate<String> filter = (String ch)->phrase.contains(ch);
		
		// Version Méthodes de référence sur une instance fixe: ici c'est phrase
		Predicate<String> filter_mr = phrase::startsWith;
		
		System.out.println(filter.test("oca"));
		System.out.println(filter_mr.test("oca"));
	}

}
