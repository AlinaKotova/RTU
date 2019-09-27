package imperativeLambda;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static imperativeLambda.PerfectNumberLambda.STATE.ABUNDANT;
import static imperativeLambda.PerfectNumberLambda.STATE.DEFICIENT;
import static imperativeLambda.PerfectNumberLambda.STATE.PERFECT;

import org.junit.Test;

public class PerfectNumberLambdaTest {

	@Test
	public void test6Perfect() {
		assertEquals(PERFECT, PerfectNumberLambda.process(6));
	}

	@Test
	public void test8Deficient() {
		assertEquals(DEFICIENT, PerfectNumberLambda.process(8));
	}

	@Test
	public void test20Abundant() {
		assertEquals(ABUNDANT, PerfectNumberLambda.process(20));
	}

	@Test
	public void test16DeficientWithIntSqrt() {
		assertEquals(DEFICIENT, PerfectNumberLambda.process(16));
	}

	@Test
	public void test1Deficient() {
		assertEquals(DEFICIENT, PerfectNumberLambda.process(1));
	}

	@Test
	public void testDivisors1() {
		Object[] expected = new Integer[] { 1 };
		int n = 1;
		assertArrayEquals(expected, PerfectNumberLambda.divisors(n).toArray());
	}

	@Test
	public void testDivisors6() {
		Object[] expected = new Integer[] { 1, 2, 3, 6 };
		int n = 6;
		assertArrayEquals(expected, PerfectNumberLambda.divisors(n).toArray());
	}

	@Test
	public void testDivisors8() {
		Object[] expected = new Integer[] { 1, 2, 4, 8 };
		int n = 8;
		assertArrayEquals(expected, PerfectNumberLambda.divisors(n).toArray());
	}

}
