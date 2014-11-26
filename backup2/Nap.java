public class Nap {
	public static void nap(long msec){
		try{
			Thread.sleep(msec);
		} catch (InterruptedException e){
			System.out.println("Nap interrupted: " + e);
		}
	}
}