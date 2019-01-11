package tugas.besar.kakas.perangkat.lunak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathTest {
	
	@Test
	public void tesHitungMod() {
		Math m = new Math();
		int actual = m.mod(11, 3);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void tesHitungSqrt() {
		Math m = new Math();
		double actual = m.sqrt(9.0);
		double expected = 3.0;
		assertEquals(expected, actual, 1e-8);
		
	}

}
