package day01022026.interfacesFonctionnelles;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Exemples_Interfaces_Fonctionnelles {

	public static void main(String[] args) {
		Function<String,Integer> mapper = (String nom)->nom.length();
		
		System.out.println(mapper.apply("amine"));
		
		BiFunction<String, String, Integer>map = (String nom, String prenom)->nom.length()+prenom.length();
		System.out.println(map.apply("amine","mezghich"));
		
		UnaryOperator<String> transformer = (String ch)->ch.toUpperCase();
		System.out.println(transformer.apply("amine"));
		
		BinaryOperator<String> bitransformer = (String nom, String prenom)->nom.toUpperCase()+" "+prenom.toUpperCase();
		System.out.println(bitransformer.apply("amine","mezghich"));
	}

}
