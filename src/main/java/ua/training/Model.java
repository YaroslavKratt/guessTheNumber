package ua.training;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
	private static final int NUMBER = new Random().nextInt(101);
	private int lowBoundary;
	private int highBoundary;
	private ArrayList<Integer> attempts = new ArrayList<>();

	Model() {
		lowBoundary = 0;
		highBoundary = 100;
	}

	public List<Integer> getAttempts() {
		return attempts;
	}

	public void addAttempts(int attempt) {
		attempts.add(attempt);
	}


	public int getLowBoundary() {
		return lowBoundary;
	}

	public int getHighBoundary() {
		return highBoundary;
	}

	public void changeRange(int userAttempt) {
		if (Integer.compare(Model.NUMBER, userAttempt) == 1) {
			lowBoundary = userAttempt;
		} else if (Integer.compare(Model.NUMBER, userAttempt) == -1) {
			highBoundary = userAttempt;
		} else {
			lowBoundary = userAttempt;
			highBoundary = userAttempt;
		}
	}


	public int check(int userAttempt) {
		return Integer.compare(Model.NUMBER, userAttempt);
	}

}
