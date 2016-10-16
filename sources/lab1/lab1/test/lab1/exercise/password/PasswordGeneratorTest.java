package lab1.exercise.password;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordGeneratorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGenerate() {
		PasswordGenerator generator = new PasswordGenerator(new DefaultRandomProvider());
		String password = generator.generate(5);
		Assert.assertNotNull(password);
		Assert.assertEquals(5, password.length());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGenerateInvalidLen() {
		PasswordGenerator generator = new PasswordGenerator(new DefaultRandomProvider());
		generator.generate(-2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGenerateInvalidLen0() {
		PasswordGenerator generator = new PasswordGenerator(new DefaultRandomProvider());
		generator.generate(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGenerateInvalidLen26() {
		PasswordGenerator generator = new PasswordGenerator(new DefaultRandomProvider());
		generator.generate(26);
	}

	@Test
	public void testGenerate4() {
		DefinedRandomProvider random = new DefinedRandomProvider(65, 65, 65, 65, 65);
		PasswordGenerator generator = new PasswordGenerator(random);
		String password = generator.generate(4);
		Assert.assertEquals("AAAA", password);
	}

	@Test
	public void testGenerate25() {
		DefinedRandomProvider random = new DefinedRandomProvider(65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65,
				65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65);
		PasswordGenerator generator = new PasswordGenerator(random);
		String password = generator.generate(25);
		Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAA", password);
	}
}
