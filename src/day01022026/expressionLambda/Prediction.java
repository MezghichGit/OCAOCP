package day01022026.expressionLambda;

@FunctionalInterface
public interface Prediction {
	public boolean test(String paragraph);
}
