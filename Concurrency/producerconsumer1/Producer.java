package producerconsumer1;

/**
 * Producer inserts elements into the depot
 */
public class Producer extends Thread {
	  private Depot depot;

	  public Producer(String name, Depot depot) {
	    this.depot = depot;
	    setName(name);
	  }

	  public void run() {
	     for (int i = 0; i < 1000; i++) {
	      depot.put(i);
//	      try {
//	        sleep((int)(Math.random()*1000));
//	      }
//	      catch (InterruptedException e) {}
	    }
	  }
	}