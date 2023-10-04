package stacktrace1;

/**
 * Demonstration of stack trace without exceptions
 **/
public class StackTraceTest {

	public static void main(String[] args) {
		Person p = new Person("Bart Simpson");
		System.out.println("StackTrace:");
		System.out.println(p.getStackTrace());
		
		Student s = new Student("Lisa Simpson");
		System.out.println("StackTrace:");
		System.out.println(s.getStackTrace());
	}
}
