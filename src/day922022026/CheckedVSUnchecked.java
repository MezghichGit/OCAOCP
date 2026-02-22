package day922022026;

public class CheckedVSUnchecked {

	public static void m1() throws Exception  //Checked exception
	{
		System.out.println("Hello OCP");
	}
	
	public static void m2() throws RuntimeException // UncheckedException
	{
		System.out.println("Hello OCP");
		throw new NullPointerException("test");
	}
	
	
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2();

	}

}
