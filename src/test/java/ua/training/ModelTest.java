package ua.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class ModelTest {
	static  Model model;

	@BeforeEach
	public  void init() {
		model = new Model();
	}

	@Test
	void testRandomIsInRange() {
		int randomNumber;
		boolean flag = true;
		for (int i = 0; i < 1000000; i++) {
			model.setSecretNumber();
			randomNumber = model.getSecretNumber();
			if ((randomNumber >= model.getLowBoundary()) && (randomNumber <= model.getHighBoundary())){
				flag = true;
			}
			else {
				flag = false;
				System.out.println(randomNumber);
				break;
			}
		}

		assertTrue(flag);
	}


}
