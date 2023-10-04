package stacktrace1;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/**
	 * provides the call history
	 * @return StackTrace.
	 */
	public String getStackTrace() {
		// get StackTraceElemente from a Throwable Object
		StackTraceElement[] st = new Throwable().getStackTrace();
		String result = "";
		
		// walk through the stack trace and combine everything to a string
		for (StackTraceElement s: st)  {
			result += s + "\n";
		}
		return result;
	}
}
