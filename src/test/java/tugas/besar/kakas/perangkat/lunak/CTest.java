package tugas.besar.kakas.perangkat.lunak;

import junit.framework.TestCase;

public class CTest extends TestCase {
	C c = new C();
	
//	public void addTest1() {
//		assertEquals(5, c.add());
//	}
	
	public void toStringTest() {
		assertEquals("toString di kelas C", c.toString());
	}
}
