package labor10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
	Complex c1, c2;
	@Before
	public void setUp() {
		c1 = new Complex(2,3);
		c2 = new Complex(4,5);
	}
	
	@Test
	public void test() {
		c1 = c1.add(c2);
		Complex c3 = new Complex(6,8);
		assertEquals(c1, c3);
		//assertSame(c3, c1);
	}
	@Test
	public void testMult() {
		c1 = c1.mult(c2);
		Complex c3 = new Complex(-7,22);
		assertEquals(c1, c3);
	}
	@Test
	public void testAbs() {
		Complex c = new Complex(0.1,0.1);
		double d = Math.sqrt(0.02);
		double abs = c.abs();
		assertEquals(d, abs, 0.000001);
	}
	@Test
	public void testDiv() throws DivisionByZero {
		Complex c3 = c1.div(c2);
		Complex res = c3.mult(c2);
		assertEquals(c1, res);
	}
	@Test(expected = DivisionByZero.class)
	public void testDivByZero() throws DivisionByZero {
	    Complex c1 = new Complex(2, 3);
	    Complex c2 = new Complex(0, 0);
	    c1.div(c2);
	}


}
