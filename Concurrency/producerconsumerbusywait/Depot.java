package producerconsumerbusywait;

/**
 * A depot for a limited set of elements
 */
public class Depot {
	private Object[] buffer;
	private final int MAXELEMS = 3;
	
	private int counter;

	public Depot() {
		buffer = new Object[MAXELEMS];
		counter = 0;
	}

	/**
	 * Put an element into the depot: busy wait
	 */
	public void put(Object data) {
		while (isFull());
		
		buffer[counter] = data;
		counter++;
		System.out.printf("----> %s produced: %s%n", Thread.currentThread().getName(), data);
	}

	/**
	 * Get an element from the depot: busy wait
	 */
	public Object get() {
		while (empty());
		
		Object result = buffer[0];
		System.arraycopy(buffer, 1, buffer, 0, buffer.length-1);
		counter--;
		System.out.printf("<-- %s consumes: %s%n", Thread.currentThread().getName(), result);
		
		return result;
	}

	/**
	 * Depot is full?
	 * @return true if full, else false
	 */
	public boolean isFull() {
		return counter == MAXELEMS;
	}

	/**
	 * Depot empty?
	 * @return true if empty, else false
	 */
	public boolean empty() {
		return counter == 0;
	}
}
