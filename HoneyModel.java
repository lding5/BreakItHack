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

}