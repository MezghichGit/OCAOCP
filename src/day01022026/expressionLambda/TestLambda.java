package day01022026.expressionLambda;

public class TestLambda {
	
	public static void main(String[] args) {
		//Prediction containsOCA = (String paragraph)->paragraph.contains("OCA");
		Prediction containsOCP = (String paragraph)->paragraph.contains("OCP");
		Prediction containsDevops = (String paragraph)->paragraph.contains("Devops");
		
		// forme réduite
		//Prediction containsOCA =  paragraph->paragraph.contains("OCA");
		
		// forme verbose
		Prediction containsOCA =  (String paragraph)->{
			return paragraph.contains("OCA");};
	
		String phrase = "Formation OCA, Java, OC, Devops, Angular";
		System.out.println(containsOCA.test(phrase));
		System.out.println(containsOCP.test(phrase));
		System.out.println(containsDevops.test(phrase));
	}

}
