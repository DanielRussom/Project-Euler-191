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
		validStrings.add("");
		evolve();
	}

	public void evolve() {
		if (numDays == 0) {
			return;
		}
		evolve(1);
	}

	private void evolve(int currentDay) {
		ArrayList<String> nextGeneration = new ArrayList<String>();
		for (String currentString : validStrings) {
			nextGeneration.addAll(createNewValidGeneration(currentString));
		}
		validStrings = nextGeneration;
		System.out.println(nextGeneration.size() + " valid matches in " + currentDay + " days.");
		if (currentDay < numDays) {
			evolve(currentDay + 1);
		}
	}

	public static ArrayList<String> createNewValidGeneration(String currentGeneration) {
		ArrayList<String> newGeneration = new ArrayList<String>();
		newGeneration.add(currentGeneration + "O");
		if (!currentGeneration.contains("L")) {
			newGeneration.add(currentGeneration + "L");
		}
		if (currentGeneration.length() < 2) {
			newGeneration.add(currentGeneration + "A");
		} else {
			String subString = currentGeneration.substring(currentGeneration.length() - 2);
			if (!subString.equals("AA")) {
				newGeneration.add(currentGeneration + "A");
			}
		}
		return newGeneration;
	}

	public static void main(String[] args) {
		new Controller();
	}
}