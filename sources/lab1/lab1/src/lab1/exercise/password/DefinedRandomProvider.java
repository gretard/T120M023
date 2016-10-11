package lab1.exercise.password;

public class DefinedRandomProvider implements IRandomProvider {

	private int[] values;

	private int counter = 0;

	public DefinedRandomProvider(int... values) {
		this.values = values;
	}

	@Override
	public int next() {
		int val = this.values[counter++];
		return val;
	}

}
