package day04022026;

import java.util.Optional;

public class Exemple_Optional {

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}

	public static void main(String[] args) {

		Optional<String> res = Optional.of("");
		if (res.isPresent()) {
			System.out.println("Not empty");
		} else
			System.out.println("Empty");

		res.ifPresent(System.out::println);

		System.out.println(average());
		System.out.println(average(90, 100));

		Optional<Double> result = average();
		/*
		 * if(result.isPresent()) { System.out.println(result.get()); } else
		 * System.out.println("No value present");
		 * 
		 * result.ifPresent(System.out::println);
		 */
		// Exemple d'assertion
		// int nbr = 100;
		// .....
		// assert (nbr == 100) : ("Valeur invalide");
		// assert (result.isPresent()):("optional est vide");
		// fonction (nbr);

		Optional<Double> opt = average(10, 2);
		System.out.println(opt.orElse(Double.NaN));
		System.out.println(opt.orElseGet(() -> Math.random()));
		System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
	}

}
