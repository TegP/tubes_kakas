package tugas.besar.kakas.perangkat.lunak;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DTest {

	// D d = new D();
	private D d;

	// public void test1() {
	// assertEquals("Ctor di kelas D", d);
	// }

	@Before
	public void setUp() throws Exception {
		d = new D();
	}

	@Test
	public void powTest() {
		assertEquals(125, d.pow(5, 3), 0.00);
	}

	@Test
	public void toStringTest() {
		assertEquals("toString di kelas D", d.toString());
	}
}
