package filetest3;

import java.io.File;

/**
 * Demonstrating file and directory operations (creation, change, ...)
 */
public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File f = new File("src/filetest3/NewDirectory");
		if (f.mkdir())
			System.out.println(f.getName() + " created");
		else
			System.out.println(f.getName() + " could not be created");
		// -----------------------------------------------
		f = new File("src/filetest3/SubDirectory/New1");
		if (f.mkdir()) // cannot be created if SubDirectory does not exist
			System.out.println(f.getName() + " created");
		else
			System.out.println(f.getName() + " could not be created");
		// -----------------------------------------------
		f = new File("src/filetest3/SubDirectory2/New2");
		if (f.mkdirs()) // can be created even if SubDirectory2 does not exist
			System.out.println(f.getName() + " created");
		else
			System.out.println(f.getName() + " could not be created");
		// -----------------------------------------------	
		File newName = new File("src/filetest3/SubDirectory2/NewRenamed");
		if (f.renameTo(newName))
			System.out.println(f.getName() + " was renamed to: "
					+ newName.getName());
		else
			System.out.println(f.getName() + " could not be renamed");
		// -----------------------------------------------
		File newLocation = new File("src/filetest3/Moved");
		if (f.renameTo(newLocation)) // f was renamed => further access to f is impossible
			System.out.println(f.getPath() + " was moved to: "
					+ newLocation.getPath());
		else
			System.out.println(f.getPath() + " could not be moved");
		// -----------------------------------------------
		if (newName.renameTo(newLocation))
			System.out.println(newName.getPath() + " was moved to: "
					+ newLocation.getPath());
		else
			System.out.println(newName.getPath()
					+ " could not be moved");
	}

}
