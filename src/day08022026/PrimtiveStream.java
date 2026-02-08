package day08022026;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimtiveStream {
	private static int range(IntStream ints) {
		IntSummaryStatistics stats = ints.summaryStatistics();
		if (stats.getCount() == 0)
			throw new RuntimeException();
		System.out.println(stats.getSum());
		return stats.getMax() - stats.getMin();
	}

	public static void main(String[] args) {
		/*
		 * Stream<Integer> stream = Stream.of(1, 2, 3);
		 * 
		 * System.out.println(stream.mapToInt(x -> x).sum());
		 * 
		 * IntStream intStream = IntStream.of(1, 2, 3); OptionalDouble avg =
		 * intStream.average(); System.out.println(avg.getAsDouble());
		 */
		/*
		 * IntStream range = IntStream.range(1, 6); range.forEach(System.out::println);
		 * System.out.println(); IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		 * rangeClosed.forEach(System.out::println);
		 * 
		 * DoubleStream ds = DoubleStream.of(12.5,4.5,3);
		 * ds.mapToInt(x->(int)x).forEach(System.out::println);
		 * 
		 * IntStream is = IntStream.of(12,4,3);
		 * is.mapToDouble(x->x).forEach(System.out::println);
		 * 
		 * Stream<String> objStream = Stream.of("penguin", "fish"); IntStream intStream
		 * = objStream.mapToInt(s -> s.length());
		 */

		IntStream stream = IntStream.rangeClosed(1,10);
		//IntStream stream = IntStream.empty();
		
		System.out.println(range(stream));
		//OptionalDouble optional = stream.average();
		//optional.ifPresent(System.out::println);
		// System.out.println(optional.getAsDouble());
		//System.out.println(optional.orElseGet(() -> Double.NaN));

	}

	
}
