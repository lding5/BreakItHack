public class HoneyEater implements Runnable{

	private int eatingPace;
	private int napTime;
	private static int honeypot;
	private static String lastEater; 
	private String name;

	public HoneyEater(int honeypot, String name, int eatingPace, int napTime) {
		this.honeypot = honeypot;
		this.name = name;
		this.eatingPace = eatingPace;
		this.napTime = napTime;
	}

	public void run() {
		System.out.println(name + " is here.");
		boolean isRunning = true; 

		while (isRunning){ 
			if (honeypot > 0 && honeypot >= eatingPace) {
				eat();
			} else {
				System.out.println("\t" + name + " leaves. Honeypot (" + honeypot + ") doesn't have enough for " + eatingPace);
				isRunning = false;
			}
		} 
		// System.out.println("== Honey left: " + honeypot + " Last Eater: " + lastEater);
	}

	public synchronized void eat(){
		try {
			System.out.println(name + " eats " + eatingPace + " from honeypot (" + honeypot +"). Nap time!");
			honeypot -= eatingPace;
			lastEater = name;
			Thread.sleep(napTime);
		} catch (InterruptedException e){
			System.out.println("InterruptedException");
			System.out.println(e);
		}
	}

	public String toString(){
		return name + "= " + "eating pace: " + eatingPace + " naps (msec): " + napTime;
	}

	public String getName() {
		return name;
	}

	public String getLastEater() {
		return lastEater;
	}
	public int getHoneypot() {
		return honeypot;
	}
}
