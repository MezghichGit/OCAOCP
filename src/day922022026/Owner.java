package day922022026;
import java.nio.file.*;
import java.nio.file.attribute.UserPrincipal;
import java.io.IOException;
public class Owner {

	public static void main(String[] args) {
		

		try {
		    // Read owner of file
		    Path path = Paths.get("C:\\zoo\\addresses.txt");
		    System.out.println(Files.getOwner(path).getName());

		    // Change owner of file
		    UserPrincipal owner = path.getFileSystem()
		        .getUserPrincipalLookupService().lookupPrincipalByName("LAPTOP-FU8PV5E5\\Amine");

		    Files.setOwner(path, owner);

		    // Output the updated owner information
		    System.out.println(Files.getOwner(path).getName());
		} catch (IOException e) {
		    // Handle file I/O exception...
		    e.printStackTrace();
		}

	}

}
