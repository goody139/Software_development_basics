package stacktrace1;

public class Student extends Person {
	
	public Student(String name) {
		super(name);
	}
	
	public String getName() {
		return super.getName();
	}
	
	public String getStackTrace() {
		return super.getStackTrace();
	}
}
