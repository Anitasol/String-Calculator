package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.Rule; 

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumber() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testManyNumber() {
		assertEquals(10, Calculator.add("2,3,5"));
	}

	@Test
	public void testNewLine() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public final void testIfNegative() {
		Exception exception = null;
		try {
			Calculator.add("-1,2");
		} catch (Exception e) {
			exception = e;
		}
	}

	@Test
	public final void testIfManyNegatives() {
		Exception exception = null;
		try {
			Calculator.add("3,-5,6,-9");
		} catch (Exception e) {
			exception = e;
		}
	}
}
