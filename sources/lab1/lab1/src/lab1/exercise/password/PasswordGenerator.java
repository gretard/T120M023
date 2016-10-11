package lab1.exercise.password;

public class PasswordGenerator {
	private IRandomProvider randomProvider;

	public PasswordGenerator(IRandomProvider randomProvider) {
		this.randomProvider = randomProvider;
	}

	public String generate(int len) {
		if (len <= 0 || len > 25) {
			throw new IllegalArgumentException("Please check input length");
		}
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			sb.append((char) this.randomProvider.next());
		}

		return sb.toString();
	}
}
