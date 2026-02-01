package day01022026.expressionLambda;

public class ContainsDevops implements Prediction{

	@Override
	public boolean test(String paragraph) {
		return paragraph.contains("Devops");
	}

}
