package exception4;

import java.io.IOException;

/**
 * Test class to demonstrate exception throwing
 * (covariance in particular)
 * */

public class MyFileTest {

	 public static void main(String[] args)  {
		
		MyFile mf = new MyFile("src/exception4", "NewFile");
		// MyFile mf = new MySubFile("src1/exception4", "NewFile");

		try {
			if(mf.createFile())
				System.out.println("File created");
		} catch (Exception e) {
			System.err.println("File could not be created");
		}
	}

}
