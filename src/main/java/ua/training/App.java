package ua.training;

/**
 * This is a guess number game, have fun)
 */
public class App {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		controller.start();
	}
}
