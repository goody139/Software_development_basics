package inheritance1;

public class Person {
	
	protected String name;
	
	public Person() {
		// System.out.println("super constructor has been called");
		name = "NA Person"; // NA = not available
	}
	
	public Person(String name) {
		this.name = name;
	}
}
