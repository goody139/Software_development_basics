package interface3;

// Example: Functional Interface (Java 8)

@FunctionalInterface
public interface Buyable {
	int MAX_PRICE = 100000;
	
	// static method with implementation (utility method):
	static boolean isValidPrice(double price) {
		return price >= 0 && price < MAX_PRICE;
	}
	
	// interface method as usual (implicitly always public):
	double price();
	
	// compiler error if the functional interface (cf. annotation) has more than one abstract method
	// int negotiate();
	
	// default method with standard implementation (extended interface):
	default boolean hasPrice() { return price() > 0; }
}
