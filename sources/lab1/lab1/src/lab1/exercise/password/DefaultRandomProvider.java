package lab1.exercise.password;

import java.util.Random;

public class DefaultRandomProvider implements IRandomProvider {

	private final Random random = new Random();

	@Override
	public int next() {
		return this.random.nextInt(33)+93;
	}

}
