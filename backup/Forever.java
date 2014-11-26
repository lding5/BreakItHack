public class Forever implements Runnable {
	private String message;

	public Forever(String message){
		this.message = message;
	}

	public void nap2(long msec){
		try{
			Thread.sleep(msec);
		} catch (InterruptedException e){
			System.out.println("Nap interrupted: " + e);
		}
	}


	public void run(){
		while(true){
			System.out.println(message);
			long napTime = Math.round(10000*Math.random());
			System.out.println("- napping " + napTime);
			this.nap2(napTime);
		}
	}
}