package exception4;

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
	
	public String getPath() {
		return path;
	}
	
	public String getName() {
		return name;
	}
	
    // in Java exception (types) are covariant
	public boolean createFile() throws Exception {
		return (new File(path+File.separator+name).createNewFile());
	}
	
}
