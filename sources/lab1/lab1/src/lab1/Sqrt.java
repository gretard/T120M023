package lab1;

public class Sqrt {
	public static double sqrt(double a) {
		if (a < 0 || a == Double.NaN || a == Double.NEGATIVE_INFINITY || a == Double.POSITIVE_INFINITY) {
			return 0;
		}
		return Math.sqrt(a);
	}
}
