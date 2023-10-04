package constructors1;

public class PersonBad {
	
	String name;
	int age;
	
	public PersonBad(String name,int age) {
		this.name = name;
		// knowledge about age range is scattered / redundant:
		// change to new age limit to 25 might lead to inconsistency
		if (age >= 10) this.age = age;  
		else this.age = 0;
	}
	
	public PersonBad(int age) {
		this.name = "NA";
		// knowledge about age range is scattered / redundant:
		if (age >= 10) this.age = age;
		else this.age = 0;
	}
	
	public PersonBad() {
		this.name = "NA";
		this.age = 0;
	}
	
}
