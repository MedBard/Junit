package by.academy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathTest1 extends Assert {
	private int valueA;
	private int expected;

	public MathTest1(int valueA, int expected) {
		this.valueA = valueA;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { -2, 2 }, { 2, 2 }, { -12, 12 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Math.abs(valueA), 0);
	}
}
