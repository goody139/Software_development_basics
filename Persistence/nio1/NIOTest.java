package nio1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demonstration of NIO.2
 */
public class NIOTest {


	public static void main(String[] args) {
		
		// a path to a file or directory
		FileSystem fs = FileSystems.getDefault();
		Path p = fs.getPath("src");
		p = p.resolve("nio1/test.txt");  // extend the path
		System.out.println("A path with a Path object: " + p);
		
		// Alternative path object creation
		p = Paths.get("src/nio1/test.txt");
		
		// resolve the path to a full address (using the file system)
		System.out.println("Absolute path with a Path object: " + p.toAbsolutePath());

		// From File (java.io) to Path (java.nio)
		File f = new File("src/nio1/test.txt");
		p = f.toPath();
		System.out.println("Path from a java.io.File object: " + p);
		
		// create a real file
		try {
			Files.createFile(p);
		} catch (IOException e1) {
			 e1.printStackTrace();
		}
		
		// Access the real file contents
		try {
			String content = new String(Files.readAllBytes(p), StandardCharsets.UTF_8 );
			System.out.println("File contents: " + content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Moving
//		try {
//			Files.move(p, Paths.get("src/nio1/testB.txt"));
//			System.out.println("Moving from " + p.toString() + " to: src/nio1/testB.txt");
//		} catch (IOException e) {
//			 e.printStackTrace();
//		}
//		
//		// Access the real file contents with the old Path object (immutable)
//		try {
//			String content = new String(Files.readAllBytes(p), StandardCharsets.UTF_8 );
//			System.out.println("File contents: " + content);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

}
