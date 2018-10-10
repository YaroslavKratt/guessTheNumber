package ua.training;

import java.util.Scanner;

class Controller {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		view.printMessage(View.WELCOME_MESSAGE);
		play();
	}

	private void play() {
		int userAttemp;
		String notValidatedInput;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {
			if (i > 0) {
				view.printMessage(View.ATTEMPTS_MESSAGE + model.getAttempts());
			}
			view.printRange(model.getMin(), model.getMax());
			notValidatedInput = sc.next();
			if (validate(notValidatedInput)) {
				userAttemp = Integer.parseInt(notValidatedInput);
				i++;
				if (model.check(userAttemp)) {
					view.printMessage(View.WIN_MESSAGE);
					break;
				} else if (userAttemp >= model.getMin() && userAttemp <= model.getMax()) {
					if (userAttemp > model.getNUMBER()) {
						view.printMessage(View.LESS_MESSAGE);
						model.addAttempts(userAttemp);

					} else {
						view.printMessage(View.MORE_MESSAGE);
						model.addAttempts(userAttemp);

					}
					model.changeRange(userAttemp);
				} else {
					view.printMessage(View.OUT_OF_RANGE_MESSAGE);
					i--;
				}
			} else {
				view.printMessage(View.WRONG_INPUT_MESSAGE);
			}
		 }
	}


	boolean validate(String notValidatetInput) {
		try {
			notValidatetInput.trim();
			Integer.parseInt(notValidatetInput);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
