package dynamicbinding2;

public class Person {
	
	public String name;
	

	public Person() {
		name = "Person Name";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Person with Name: "+ name;
	}
	
}
