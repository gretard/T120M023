package lab1;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {

	@Test
	public void testDivide() {
		String result = Division.divide(1, 1);
		Assert.assertEquals("1.0", result);
	}

}
