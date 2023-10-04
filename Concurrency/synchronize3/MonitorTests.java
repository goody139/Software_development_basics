package synchronize3;

/**
 * Several swap methods to swap elements in an array.
 * Concurrent swapping on one array would be a problem.
 * Therefore, synchronization is needed.
 * Each of the swap methods has a different kind of synchronization monitor.
 */
public class MonitorTests {
    // artificial object to serve as a monitor object
	private final Object MYMONITOR = new Object();

	// we want to swap elements in this array
	private Object[] array; 

	// constructor creates and fills the array
	public MonitorTests(Object[] o) {
		array = new Object[o.length];
		System.arraycopy(o, 0, array, 0, o.length);
	}

	// swap1 synchronizes on the object which internally represents the Object class 
	public void swap1(int index1, int index2) {
		synchronized (Object.class) {
			Object tmp = array[index1];
			array[index1] = array[index2];
			array[index2] = tmp;

		}
	}

	// swap2 synchronizes using that object as monitor
	// which internally represents the MonitorClass class 
	public void swap2(int index1, int index2) {
		synchronized (MonitorTests.class) {
			Object tmp = array[index1];
			array[index1] = array[index2];
			array[index2] = tmp;
		}
	}

	// swap3 uses an artifical general object as synchronization monitor
	public void swap3(int index1, int index2) {
		synchronized (MYMONITOR) {
			Object tmp = array[index1];
			array[index1] = array[index2];
			array[index2] = tmp;
		}
	}

	// swap4 uses the critical resource itself (array) as monitor (best choice)
	public void swap4(int index1, int index2) {
		synchronized (array) {
			Object tmp = array[index1];
			array[index1] = array[index2];
			array[index2] = tmp;
		}
	}
}
