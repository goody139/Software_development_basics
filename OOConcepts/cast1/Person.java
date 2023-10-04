package cast1;

public class Person {

	private String name;
	
	public Person() {
		this("NA");
	}
	
	public Person(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() { // overriding
		return "Person with Name: "+ name;
	}
}
