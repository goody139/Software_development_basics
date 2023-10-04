package exceptionthrowing3;

import java.io.IOException;

public class MyFileTest {

	// what if main also does not want to deal with the exception ...?: 
	//  (delegating the exception handling to the runtime environment)
	// a) eliminate the try/catch in main to forward the exception
	// b) forward explicitly to the runtime environment with:
	//     public static void main(String[] args) throws IOException {
	
	 public static void main(String[] args) {
		
		MyFile mf = new MyFile("src/exception3", "NewFile");
		try {
			if(mf.createFile())
				System.out.println("File created");
		} catch (IOException e) {
			System.err.println("File could not be created");
		}
	}

}
