import java.util.*;

public class Consumer implements Runnable {
	private LinkedList <Integer> queue;
	public Consumer (LinkedList <Integer> queue){
		this.queue = queue;
	}

	public void run(){

		try {
			while (true){
				System.out.print("Consumer: ");

				if (!queue.isEmpty()){
					queue.remove();
					System.out.println(queue.size());
				} 
				Thread.sleep(Math.round((float) (1000*Math.random())));
			}
		} catch (InterruptedException e){
			System.out.println(e);
		}
	}
}