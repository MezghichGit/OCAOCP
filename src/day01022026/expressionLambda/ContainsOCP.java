package day01022026.expressionLambda;

public class ContainsOCP implements Prediction{

	@Override
	public boolean test(String paragraph) {
		return paragraph.contains("OCP");
	}

}
