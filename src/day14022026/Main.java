package day14022026;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.version"));
		
		File file = new File("D:\\OCP\\OCA-OCP-2021");
		System.out.println(file.exists());

	}

}
