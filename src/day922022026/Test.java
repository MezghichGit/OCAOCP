package day922022026;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class Test {

	public static void main(String[] args) {
		/*
		 * try { //Files.createDirectory(Paths.get("/bison/field"));
		 * Files.createDirectories(Paths.get("/bisons/field/pasture/green")); } catch
		 * (IOException e) { System.out.println("Problème : "+e.getMessage());
		 * 
		 * }
		 */

		/*
		 * try { Files.copy(Paths.get("c:/panda"), Paths.get("c:/panda-save"));
		 * Files.copy(Paths.get("c:/panda/bamboo.txt"),
		 * Paths.get("c:/panda-save/bamboo.txt")); } catch (IOException e) { // Handle
		 * file I/O exception... }
		 */
		/*
		try {
			Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new"));
			Files.move(Paths.get("c:\\user\\addresses.txt"), Paths.get("c:\\zoo-new\\addresses.txt"));
		} catch (IOException e) {
			System.out.println("Problème : "+e.getMessage());
			e.printStackTrace();
		}*/
		try {
		final Path path = Paths.get("C:\\zoo\\addresses.txt");
		System.out.println(Files.getLastModifiedTime(path));
		System.out.println(Files.getLastModifiedTime(path).toMillis());

		Files.setLastModifiedTime(path,
		        FileTime.fromMillis(System.currentTimeMillis()));

		System.out.println(Files.getLastModifiedTime(path).toMillis());
		} catch (IOException e) {
			System.out.println("Problème : "+e.getMessage());
			e.printStackTrace();
		}
	}

}
