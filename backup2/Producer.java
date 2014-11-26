import java.util.*;

public class Producer implements Runnable {
	private LinkedList <Integer> queue; 

	public Producer(LinkedList <Integer> queue){
		this.queue = queue;
	}

	public void run() {

		try{
			while(true){
				System.out.print("P: ");
				int x = Math.round((float) (1000*Math.random()));
				queue.add(x);
				System.out.println(queue.size());
				Thread.sleep(x);
			}
		} catch (InterruptedException e){
			System.out.println(e);
		}
	}
}