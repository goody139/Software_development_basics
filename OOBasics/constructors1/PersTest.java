package constructors1;

public class PersTest {
	public static void main(String[] args) {
		// - with redundant constructors
		PersonBad p1 = new PersonBad("Fritz Fischer",24);
		System.out.println("Name1: " + p1.name);
		System.out.println("Age1: " + p1.age);

		PersonBad p2= new PersonBad(24);
		System.out.println("Name2: " + p2.name);
		System.out.println("Age2: " + p2.age + "\n");  
		
		// - with constructor chaining to avoid redundancy
		System.out.println("With Constructor Chaining: \n");
		Person1 p3 = new Person1("Fritz Fischer",24);
		System.out.println("Name3: " + p3.name);
		System.out.println("Age3: " + p3.age);

		Person1 p4= new Person1(24);
		System.out.println("Name4: " + p4.name);
		System.out.println("Age4: " + p4.age + "\n"); 
		
		// - effect of change: adapt Person1 and PersonBad to age limit 25 and compare the new output
		// - in action: "this" for access to instance variables and "this()" as constructor call

		// - reverse constructor chain:
		PersonBad2 p5= new PersonBad2("Fritz Fischer",24);
		System.out.println("Name5: " + p5.name);
		System.out.println("Alter5: " + p5.age + "\n"); 		
		
		// - this() must be the first statement in a constructor
		// - this. may be called in any method / this() is only allowed as first statement in a constructor
	}
}
