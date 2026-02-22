package day922022026;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StreamMethods {

	public static void main(String[] args) {
		
		Path path = Paths.get("D:\\OCP\\OCA-OCP-2021");
		
		try {
			Files.walk(path).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
		} catch (IOException e) {
			// Handle file I/O exception...
			} 
		}
}
