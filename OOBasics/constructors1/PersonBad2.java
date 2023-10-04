package constructors1;

public class PersonBad2 {
	
	String name;
	int age;
	
	public PersonBad2(String name,int age) {
		this(age); // explicit constructor call
		           // automatically determines the order of the variable assignment: first set age, then set name (reverse is not possible)
		this.name = name; // explicit access to instance variable
	}
	
	public PersonBad2(int age) {
		// this way age is set twice ...:
		this(); 
		// alternative: this.name = "NA"; 
                //   name is set to a default value at several places
		//   but what if we want to change the default value "NA" to another one?				
		if (age >= 10) this.age = age;  
		else this.age = 0;
	}
	
	public PersonBad2() {
		this.name = "NA";
		this.age = 0;
	}
	
	public String getName() {
		return this.name; // accessing this reference in a non-constructor method
	}

	// not working:
//	public void test() {
//		this(); // accessing this constructor in a non-constructor method
//	}
}
