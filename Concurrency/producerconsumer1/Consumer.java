package producerconsumer1;

/**
 * Consumer: consumes the elements in the depot
 */
public class Consumer extends Thread {
	  private Depot depot;

	  public Consumer(String name, Depot depot) {
	    this.depot = depot;
	    setName(name);
	  }

	  public void run() {
	    for (int i = 0; i < 2000; i++) {
	      depot.get();
//	      try {
//	        sleep((int)(Math.random()*1000));
//	      }
//	      catch (InterruptedException e) {}
	    }
	  }
	}
