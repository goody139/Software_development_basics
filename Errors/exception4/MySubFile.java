package exception4;

import java.io.File;
import java.io.IOException;

/**
 * MySubFile is a file to demonstrate exception throwing
 * with overriding / covariance
 * */
public class MySubFile extends MyFile {	
	
	public MySubFile(String p, String n) {
		super(p,n);
	}
	
    // method overriding to demonstrate the type of the exception
	public boolean createFile() throws IOException {
		return (new File((this.getPath())+File.separator+(this.getName())).createNewFile());
	}
	
}
