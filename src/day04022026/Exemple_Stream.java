package day04022026;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemple_Stream {

	public static void main(String[] args) {
		//Méthode source : of
		List<String> data = List.of("sonia","affef","montassar","amine","wassim");
		//Stream<String> names = Stream.of();
		Stream<String> names = data.stream();
		//Plusieurs méthodes intermédiaires: filter, limit, peek // Méthode terminale :  collect
		
		//List<String>res = names.filter(s->s.contains("i")).limit(2).peek(System.out::println).collect(Collectors.toList());
		
		//Méthode terminale :  count
		//long res = names.filter(s->s.contains("i")).peek(System.out::println).count();
		
		//names.filter(s->s.contains("i")).forEach(System.out::println);
		names.forEach(System.out::println);
		//System.out.println(names.count());
		

	}

}
