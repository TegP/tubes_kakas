package tugas.besar.kakas.perangkat.lunak;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTest {
	
//	B b = new B();
	
	private B b;
	
//	public void test1() {
//		assertEquals("Ctor di kelas B", b);
//	}
	
	@Before
	public void setUp() throws Exception {
		b = new B();
	}

	@Test
	public void powTest() {
		assertEquals(27, b.pow(3, 3), 0);
	}
	
	@Test
	public void mulTest() {
		assertEquals(20, b.mul(4, 5), 0);
	}
	
	@Test
	public void divTest() {
		assertEquals(8, b.div(32, 4), 0);
	}
	
	public void toStringTest() {
		assertEquals("toString di kelas B", b.toString());
	}
}
