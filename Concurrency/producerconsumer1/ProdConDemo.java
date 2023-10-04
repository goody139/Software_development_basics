package producerconsumer1;

/**
 * Many Consumer, many Producer
 */
public class ProdConDemo {

	public static void main(String args[]) {
		Depot depot = new Depot();
		Producer producer1 = new Producer("Producer1",depot);
		Producer producer2 = new Producer("Producer2",depot);
		Producer producer3 = new Producer("Producer3",depot);
		Producer producer4 = new Producer("Producer4",depot);
		
		Consumer consumer1 = new Consumer("Consumer1",depot);
		Consumer consumer2 = new Consumer("Consumer2",depot);
		
		producer1.start();
		producer2.start();
		producer3.start();
		producer4.start();
		
		consumer1.start();
		consumer2.start();
		
	}

}

