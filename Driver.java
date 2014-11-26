import java.io.*;
import java.util.*;

public class Driver{
	private static int honeypot;

	public static void main(String [] args) throws IOException{
		if (args.length != 1){
			System.out.println("Please supply a textfile");
			System.exit(1);
		}

		System.out.println("Textfile supplied: " + args[0]);
		Scanner reader = new Scanner(new File(args[0]));

		honeypot = reader.nextInt();
		reader.nextLine();

		LinkedList <HoneyEater> honeyEaterList = new LinkedList <HoneyEater> ();
		LinkedList <Thread> threadList = new LinkedList <Thread> ();

		while (reader.hasNext()){
			String[] line = reader.nextLine().split(" ");
			HoneyEater eater = new HoneyEater(honeypot, line[0], new Integer(line[1]), new Integer(line[2]));
			honeyEaterList.add(eater);
			threadList.add(new Thread(eater, eater.getName()));
		}

		System.out.println("Honeypot: " + honeypot);
		System.out.println("Eaters: " + honeyEaterList);
		System.out.println("_____________________");

		for (Thread t : threadList){
			t.start();
		}

		while(Thread.activeCount() != 1) {}
		System.out.println("_____________________");
		HoneyEater honeyEater = honeyEaterList.getFirst();
		System.out.println("Honey left: " + honeyEater.getHoneypot() + "\nLast eater: " + honeyEater.getLastEater());

		
	}
}