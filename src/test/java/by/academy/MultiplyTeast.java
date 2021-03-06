package by.academy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MultiplyTeast extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public MultiplyTeast(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 3, 7, 21 }, { 2, 6, 12 }, { 15, 5, 75 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getMultiply(valueA, valueB), 0);
	}
}
