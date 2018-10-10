package ua.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
	private static final int NUMBER = new Random().nextInt(101);
	private int min;
	private int max;
	private ArrayList<Integer> attempts = new ArrayList<>();

	Model() {
		min = 0;
		max = 100;
	}

	public List<Integer> getAttempts() {
		return attempts;
	}

	public void addAttempts(int attempt) {
		attempts.add(attempt);
	}


	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public void changeRange(int userAttempt) {
		if (Integer.compare(Model.NUMBER, userAttempt) == 1) {
			min = userAttempt;
		} else if (Integer.compare(Model.NUMBER, userAttempt) == -1) {
			max = userAttempt;
		} else {
			min = userAttempt;
			max = userAttempt;
		}
	}

	public static int getNUMBER() {
		return NUMBER;
	}

	public boolean check(int userAttempt) {
		if (Model.NUMBER == userAttempt) {
			return true;
		} else {
			return false;
		}

	}

}
