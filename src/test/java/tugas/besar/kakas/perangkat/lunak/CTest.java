package tugas.besar.kakas.perangkat.lunak;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CTest {
	// C c = new C();
	private C c;

	@Before
	public void setUp() throws Exception {
		c = new C();
	}
	
	@Test
	public void addTest() {
		assertEquals(0, c.add());
	}
	
	@Test 
	public void subTest() {
		assertEquals(0, c.sub());
	}
	
	@Test
	public void mulTest() {
		assertEquals(0, c.mul(), 0.00);
	}
	
	@Test
	public void divTest() {
		assertEquals(Double.NaN, c.div(), 0.00);
	}
	
	@Test
	public void modTest() {
		assertEquals(2, c.mod(18, 4));
	}
	
	@Test
	public void sqrtTest() {
		assertEquals(7, c.sqrt(49), 0.00);
	}
	
	@Test
	public void toStringTest() {
		assertEquals("toString di kelas C", c.toString());
	}
}
