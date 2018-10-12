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
		view.printMessage(View.WELCOME_MESSAGE);
		model.setSecretNumber();
		play();
	}

	private void play() {
		int userAttemp;
		String notValidatedInput;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		cycle:
		while (true) {
			if (i > 0) {
				view.printMessage(View.ATTEMPTS_MESSAGE + model.getAttempts());
			}
			view.printRange(model.getLowBoundary(), model.getHighBoundary());
			notValidatedInput = sc.next();
			if (validate(notValidatedInput)) {
				userAttemp = Integer.parseInt(notValidatedInput);
				i++;
				if (userAttemp >= model.getLowBoundary() && userAttemp <= model.getHighBoundary()) {
					model.changeRange(userAttemp);
					model.addAttempts(userAttemp);
					switch (model.check(userAttemp)) {
						case 0: {
							view.printMessage(View.WIN_MESSAGE);
							break cycle;
						}
						case 1: {
							if (userAttemp >= model.getLowBoundary() && userAttemp <= model.getHighBoundary()) {
								view.printMessage(View.MORE_MESSAGE);

							} else {
								view.printMessage(View.OUT_OF_RANGE_MESSAGE);
							}
							break;
						}

						case -1: {
							if (userAttemp >= model.getLowBoundary() && userAttemp <= model.getHighBoundary()) {
								view.printMessage(View.LESS_MESSAGE);

							}
							break;
						}
					}
				}
						else {
							view.printMessage(View.OUT_OF_RANGE_MESSAGE);
							i--;
						}
					}
			else {
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
