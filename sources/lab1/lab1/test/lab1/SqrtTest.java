package lab1;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {

	@Test
	public void testNegativeSqrt() {
		Assert.assertEquals(0, Sqrt.sqrt(-5));
	}

}
