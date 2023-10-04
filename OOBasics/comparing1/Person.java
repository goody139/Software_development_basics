package comparing1;

public class Person {

	private String name;
	
	public Person() {
		name = "NA";
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Person) {
            return this.getName().equals(((Person)o).getName());
        }
        return false;
	}
	
	public int hashCode() {
		return getName().hashCode();
	}
}
