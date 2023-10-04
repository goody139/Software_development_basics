package exceptionthrowing3;

import java.io.File;
import java.io.IOException;

/**
 * MyFile is a file to demonstrate exception throwing
 * */
public class MyFile {
	
	private String path;
	private String name;
	
	public MyFile(String p, String n) {
		this.path = p;
		this.name = n;
	}
	
	/**
	 * Creates a File based on the instance variables
	 * @return true if successful else false
	 * @throws IOException in case of an IO Error
	 */
	public boolean createFile() throws IOException {
		return (new File(path+File.separator+name).createNewFile());
	}
}
