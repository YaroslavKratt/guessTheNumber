package ua.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
	private  int secretNumber;
	private int lowBoundary;
	private int highBoundary;
	private ArrayList<Integer> attempts = new ArrayList<>();

	Model() {
		lowBoundary = 1;
		highBoundary = 99;
	}
	public void setSecretNumber() {
		secretNumber = new Random().nextInt(highBoundary-lowBoundary + 1) + lowBoundary;
	}

	public  int getSecretNumber() {
		return secretNumber;
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
		if (Integer.compare(secretNumber, userAttempt) == 1) {
			lowBoundary = userAttempt;
		} else if (Integer.compare(secretNumber, userAttempt) == -1) {
			highBoundary = userAttempt;
		} else {
			lowBoundary = userAttempt;
			highBoundary = userAttempt;
		}
	}


	public int check(int userAttempt) {
		return Integer.compare(secretNumber, userAttempt);
	}

}
