package lock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Manages an Object-Array and provides methods to swap array elements
 */
public class MyArray {
	private Object[] array;

	// Lock-Object used to lock a critical section (access to the array)
	private final Lock LOCK = new ReentrantLock();

	public MyArray(Object[] o) {
		array = new Object[o.length];
		System.arraycopy(o, 0, array, 0, o.length);
	}

	/**
	 * Swaps two elements in the array
	 * @param i1 index of the first element
	 * @param i2 index of the second element
	 */
	public void swap1(int i1, int i2) {
		LOCK.lock();

		System.out.println("Thread just entered the critical section");
		// in case of an exception unlock() is not called!
		Object tmp = array[i1];
		array[i1] = array[i2];
		array[i2] = tmp;
		System.out.println("Swapped array: " + this.toString());
		
		LOCK.unlock();
		System.out.println("Thread just left the critical section");
	}

	/**
	 * Swaps two elements in the array / uses finally to definitely unlock
	 * @param i1 index of the first element
	 * @param i2 index of the second element
	 */
	public void swap2(int i1, int i2) {
		LOCK.lock();
		System.out.println("Thread just entered the critical section");
		try {
			Object tmp = array[i1];
			array[i1] = array[i2];
			array[i2] = tmp;
			System.out.println("Swapped array: " + this.toString());
		} finally {
			// finally is useful here to definitely unlock (even in case of exceptions)
			LOCK.unlock();
			System.out.println("Thread just left the critical section");
		}
	}
	
	public String toString() {
		String content = "{";
		for (int i = 0; i < (array.length);i++) {
			content = content + array[i] + "  ";
		}
		content = content + "}";
		return content;
	}
	
}
