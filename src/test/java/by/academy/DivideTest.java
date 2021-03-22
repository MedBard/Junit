package by.academy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class DivideTest extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public DivideTest(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 21, 7, 3 }, { 12, 3, 4 }, { 15, 5, 3 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getDivide(valueA, valueB), 0);
	}
}
