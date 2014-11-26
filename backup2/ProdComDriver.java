import java.util.*;

public class ProdComDriver {

	private static LinkedList <Integer> queue;

	public static void main(String [] args) throws InterruptedException{
		queue = new LinkedList <Integer>();
		Producer producer = new Producer (queue);
		Thread t1 = new Thread(producer);
		t1.start();

		Thread.sleep(100);
		Consumer consumer = new Consumer (queue);
		Thread t2 = new Thread(consumer);
		t2.start();
		while(true) ;
	}


}