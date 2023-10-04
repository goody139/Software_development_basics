package producerconsumer1;

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
	 * Put an element into the depot
	 * If necessary wait until there is space in the depot
	 * Method is synchronized at the depot to avoid change conflicts.
	 * @param data data to be inserted
	 */
	public synchronized void put(Object data) {
		while (isFull())	 // wait while full
			try {
				wait();
			} catch (InterruptedException e) {
			}
		
		buffer[counter] = data;
		counter++;
		System.out.printf("----> %s produces: %s%n", Thread.currentThread().getName(), data);
		notifyAll();
	}

	/**
	 * Get an element from the depot
	 * If necessary wait until the depot contains an element.
	 * Method is synchronized at the depot to avoid access conflicts.
	 * @return element from the depot
	 */
	public synchronized Object get() {
		while (empty())		// wait as long as it is empty
			try {
				wait();
			} catch (InterruptedException e) {
			}
		
		Object result = buffer[0];
		System.arraycopy(buffer, 1, buffer, 0, buffer.length-1);
		counter--;
		System.out.printf("<-- %s consumes: %s%n", Thread.currentThread().getName(), result);
		
		notifyAll();
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
