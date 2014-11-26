public class Forever implements Runnable {
	private String message;

	public Forever(String message){
		this.message = message;
	}

	public void run(){
		for(;;){
			System.out.println(message);
			long napTime = Math.round(10000*Math.random());
			System.out.println("- napping " + napTime);
			Nap.nap(napTime);
		}
	}
}