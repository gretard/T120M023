package lab1.exercise.math;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator;

	@Before
	public void setUp() throws Exception {

		calculator = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		double actual = calculator.add(12, 2);
		Assert.assertEquals(14, actual, 0);
	}

	@Test
	public void testMinus() {
		double actual = calculator.minus(15, 3);
		Assert.assertEquals(12, actual, 0);
	}

	@Test
	public void testMultiply() {
		double actual = calculator.multiply(0, 0);
		Assert.assertEquals(0, actual, 0);
	}

	@Test
	public void testDivide() {
		double actual = calculator.divide(0, 0);
		Assert.assertEquals(Double.NaN, actual, 0);
	}

}
