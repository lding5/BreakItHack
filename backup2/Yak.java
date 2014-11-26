public class Yak {
	private static void begin(String msg){
		Forever forever = new Forever(msg);
		Thread t = new Thread(forever);
		t.start();
	}

	public static void main(String args[]){
		String tabs ="";
		for (String a : args){
			begin(tabs+a);
			tabs +="\t";
		}
		for(;;);
	}
}