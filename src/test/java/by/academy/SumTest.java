package by.academy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class SumTest extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public SumTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 2, 2, 4 }, { 20, 41, 61 }, { 15, 5, 20 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSum(valueA, valueB), 0);
	}
}
