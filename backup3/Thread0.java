public class Thread0 {
	public static void main(String [] args){
		try {
			System.out.println("thread starting");
			System.out.println("# threads: " + Thread.activeCount());
			//Thread t1 = new Thread("asdf");
			System.out.println("# threads: " + Thread.activeCount());
			Thread current = Thread.currentThread();
			System.out.println(current);
			current.interrupt();
			System.out.println("# threads: " + Thread.activeCount());
			System.out.println(Thread.interrupted());
			System.out.println(Thread.interrupted());
		} catch (Exception e){
			System.out.println("interrupted!!");
		}
	}
}