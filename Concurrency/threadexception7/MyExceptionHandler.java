package threadexception7;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * Implements an ExceptionHandler for a thread
 */
public class MyExceptionHandler implements UncaughtExceptionHandler {

	private String msg;
	
	public MyExceptionHandler(String msg) {
		this.msg = msg;
	}
		
	 // see java.lang.Thread.UncaughtExceptionHandler#uncaughtException(java.lang.Thread, java.lang.Throwable)

	public void uncaughtException(Thread t, Throwable e) {
		System.err.println("\nAn error occurred: " + msg);
		
		// call some methods of t to clean-up left-overs if necessary
		
		System.err.println(e.getMessage());
	}

}
