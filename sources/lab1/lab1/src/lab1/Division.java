package lab1;

public class Division {
	public static String divide(int a, int b) {
		if (b != 0) {
			double res = a / b;
			return Double.toString(res);
		} else {
			return "Division by zero!";
		}
	}
}
