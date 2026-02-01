package day01022026.expressionLambda;

public class ComputeWithLambda {

	public static void main(String[] args) {
		// version verbose
		Operation op_somme = (double a, double b)->{return a+b;};
		
		// version réduite
		Operation op_somme_v2 = (a,b)->a+b;
		
		Operation op_produit = (a,b)->a*b;
		
		System.out.println(op_somme.compute(10, 30));

	}

}
