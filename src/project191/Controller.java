package project191;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	private ArrayList<String> validStrings = new ArrayList<String>();
	private int numDays = 0;
	
	public Controller() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of days:");
		numDays = scan.nextInt();
		evolve();
	}

	public void evolve() {
		if (numDays == 0) {
			return;
		}
		evolve(numDays);
	}

	private static void evolve(int remainingDays) {
		
	}
	public static void main(String[] args) {
		new Controller();
	}
}