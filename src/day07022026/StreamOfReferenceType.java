package day07022026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfReferenceType {

	public static void main(String[] args) {
		
		Stream<Double> numbers = Stream.generate(()->Math.random()); // méthode source : generate
		
		Stream<Double> numbersV2 = Stream.generate(Math::random);
		
		//numbers.limit(10).forEach(System.out::println);  // méthode terminale : foreach
		
		System.out.println(numbers);
		List<Integer> list = Arrays.asList(10,2,4);
		System.out.println(list);
	}

}
