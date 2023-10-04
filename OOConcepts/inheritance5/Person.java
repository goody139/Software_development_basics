package inheritance5;

public class Person {
	
	public String name;
	
	public Person() {
		System.out.println("super constructor has been called");
		name = "NA"; // NA = not available
	}
	
	public Person(String name) {
		System.out.println("super constructor has been called to set the person name");
		this.name = name;
	}
}
