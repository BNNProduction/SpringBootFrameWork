package training.workshop;

import java.util.Random;

public class DemoService {
	private Random random;

	public void setRandom(Random random) {
		this.random = random;
	}

	public String generateData(String name) {
		int number = random.nextInt(10); // 0-9
		if (number >= 5 && number <= 8) {
			return name + number;
		}
		throw new RuntimeException("Invalid number with " + number);
	}
}
