package ua.training;

public class View {
	public static final String WELCOME_MESSAGE = " Hello, I want to play a game with you." +
			"\n I made a number from 0 to 100, guess it!";
	public static final String LESS_MESSAGE = "Less";
	public static final String MORE_MESSAGE = "More";
	public static final String ATTEMPTS_MESSAGE = "Your attempts were: ";
	public static final String WRONG_INPUT_MESSAGE = "Wrong input! Please, enter a number";
	public static final String WIN_MESSAGE = "YOU WIN!";
	public static final String RANGE_MESSAGE = "Now range is ";
	public static final String OUT_OF_RANGE_MESSAGE = "Do not joke with me, your number is out of Range!";


	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printRange(int min, int max) {
		System.out.println(View.RANGE_MESSAGE + "[" + min + "," + max + "]");

	}

}
