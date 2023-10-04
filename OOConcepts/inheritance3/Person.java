package inheritance3;

public class Person {
	
	private String name; // attributes should be always private
	
	public Person() {
		this("NA"); // NA = not available
	}
	
	public Person(String name) {
		this.setName(name); // replacing this.name = name;
		                    // changing attribute is localized at one place
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}	
}
