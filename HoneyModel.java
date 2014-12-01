import java.io.*;
import java.util.*;

public class HoneyModel{
	private static int honeypot;
	private static String lastEater;

	public void execute(int honeypot, HoneyEater eater){
		this.honeypot = honeypot;

		Thread t1 = new Thread(eater);

		System.out.println("Honeypot: " + honeypot);
		System.out.println("Eaters: " + eater);
		System.out.println("_____________________");

		t1.start();

		while(Thread.activeCount() != 4) {}
		System.out.println("_____________________");
		//HoneyEater honeyEater = honeyEaterList.getFirst();
		lastEater = eater.getLastEater();
		System.out.println("last eater: " + lastEater);

		

	}

	public String getResult(){
		return lastEater;
	}

	public static void main(String [] args) {
		
		// LinkedList <HoneyEater> honeyEaterList = new LinkedList <HoneyEater> ();
		// LinkedList <Thread> threadList = new LinkedList <Thread> ();

		// while (reader.hasNext()){
		// 	String[] line = reader.nextLine().split(" ");
		// 	HoneyEater eater = new HoneyEater(honeypot, line[0], new Integer(line[1]), new Integer(line[2]));
		// 	honeyEaterList.add(eater);
		// 	threadList.add(new Thread(eater, eater.getName()));
		// }

		// System.out.println("Honeypot: " + honeypot);
		// System.out.println("Eaters: " + honeyEaterList);
		// System.out.println("_____________________");

		// for (Thread t : threadList){
		// 	t.start();
		// }

		// while(Thread.activeCount() != 1) {}
		// System.out.println("_____________________");
		// HoneyEater honeyEater = honeyEaterList.getFirst();
		// System.out.println("Honey left: " + honeyEater.getHoneypot() + "\nLast eater: " + honeyEater.getLastEater());

		
	}
}