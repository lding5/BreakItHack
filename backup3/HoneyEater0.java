public class HoneyEater implements Runnable{

	private int eatingPace;
	private int napTime;
	private static int honeypot;
	private String name;

	public HoneyEater(int honeypot, String name, int eatingPace, int napTime) {
		this.honeypot = honeypot;
		this.name = name;
		this.eatingPace = eatingPace;
		this.napTime = napTime;
	}

	public void run() {
		System.out.println(name + " is starting");
		boolean isRunning = true; 
		while (isRunning & honeypot > 0){ // honeypot is not empty yet
			if (honeypot >= eatingPace) {
				eat();
			} else {
				System.out.println(name + ": DONE eating. Honeypot " + honeypot + " doesn't have enough for " + eatingPace);
				isRunning = false;
			}
		} 

	}

	public synchronized void eat(){
		try {
			System.out.println(name + ": honeypot " + honeypot + " minus " + eatingPace);
			honeypot -= eatingPace;
			Thread.sleep(napTime);
		} catch (InterruptedException e){
			System.out.println("InterruptedException");
			System.out.println(e);
		}
	}

	public String toString(){
		return name + ": " + "eatingPace: " + eatingPace + " napTimes: " + napTime;
	}

}
