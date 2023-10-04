package lock2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Link list
 * Concurrent inserting into the list with Lock protection of the critical section 
 * (the individual list entries are locked)
 */
public class MyLinkList {
	Object value;
	MyLinkList rest;
	Lock lock;
	
	public MyLinkList(Object value) {
		this.value = value;
		rest = null;
		// each node get its own lock
		lock = new ReentrantLock();
	}
	
	/**
	 * Append an element at the end of the list
	 * @param o element which has to be appended
	 */
	public void append(Object o) {
		// remember the current node
		MyLinkList node = this;
		
		// lock the current node
		node.lock.lock();
		
		// go the the end of the list
		while(node.rest!=null) {
			MyLinkList next = node.rest;

			// try to lock the next element
			next.lock.lock();
			// unlock the current node
			node.lock.unlock();

			// go to the next node
			node = next;
		}
		
		try {
			// try to append a node to the locked node
			node.rest = new MyLinkList(o);
		} finally {
			// unlock
			node.lock.unlock();
		}
	}
}
