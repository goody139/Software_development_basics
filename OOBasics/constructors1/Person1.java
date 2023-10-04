package constructors1;

public class Person1 {
	
	String name;
	int age;
	
	public Person1(String name,int age) {
		this.name = name; // explicit access to instance variable
		
		// single place of knowledge; change to new age limit is only at one place
		if (age >= 10) this.age = age;  
		else this.age = 0; 
	}
	
	public Person1(int age) {
		this("NA",age); // explicit call of the other constructor (call chain)
	}
	
	public Person1() {
		this("NA",0);
		// alternative is: this(0);
	}
	
}
