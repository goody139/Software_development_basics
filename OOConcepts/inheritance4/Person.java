package inheritance4;

public class Person {
	
	public String name;
	
//	public Person() {
//		this("NA"); // NA = not available
//	}
	
	public Person(String name) {
		setName(name); 
	}
	
//	public final String getName() { // not working
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}	
}
