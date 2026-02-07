package day07022026;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalMethods_Stream {

	public static void main(String[] args) {
		
		/*
		List<String> list = Arrays.asList("monkey", "2", "chimp");
		
		Stream<String> infinite = Stream.generate(() -> "chimp");
		
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
		System.out.println(list.stream().anyMatch(pred)); // true
		System.out.println(list.stream().allMatch(pred)); // false
		System.out.println(list.stream().noneMatch(pred)); // false
		System.out.println(infinite.allMatch(pred)); // true 
        */
		/*
		Stream<String> infinite = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> x.length()>10;
		infinite.allMatch(pred); // false
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		StringBuilder word = stream.collect(StringBuilder::new,
				StringBuilder::append, StringBuilder::append) ;
		System.out.println(word);*/
		
		//Stream<String> s = Stream.of("monkey", "gorilla", "Monkey");
		//s.filter(x -> x.toLowerCase().startsWith("m")).forEach(x->System.out.print(x+" ")); 
		//Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		//s.map(String::length).forEach(System.out::print); // 676
		
		//Stream<String> s = Stream.of("sonia", "samir", "amine","oussama");
		//s.sorted().forEach(System.out::println);
		
		//Stream<String> stream = Stream.iterate("", s -> s + "1");
        //System.out.println(stream.limit(4).map(x -> x + "2").toList());
		
		
		System.out.print(Stream.iterate(1, x -> ++x).limit(5).map(x ->""+x).collect(Collectors.joining()));

	 

	}

}
