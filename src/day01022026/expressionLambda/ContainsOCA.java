package day01022026.expressionLambda;

public class ContainsOCA implements Prediction{
	@Override
	public boolean test(String paragraph) {
		return paragraph.contains("OCA");
	}
}
