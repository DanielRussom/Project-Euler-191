package project191;

import java.util.ArrayList;

public class StringGenerationController {
	static ArrayList<String> validStrings = new ArrayList<String>();
	static int numDays = 0;

	public StringGenerationController() {
		// TODO Auto-generated constructor stub
	}

	public static void evolve() {
		if (numDays == 0) {
			return;
		}
		evolve(numDays);
	}

	private static void evolve(int remainingDays) {
		
	}

}
