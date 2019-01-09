package tugas.besar.kakas.perangkat.lunak;

import junit.framework.TestCase;

public class CTest extends TestCase {
	C c = new C();
	
	public void addTest1() {
		c.setN1(2);
		c.setN2(3);
		double n1 = c.getN1();
		double n2 = c.getN2();
		assertEquals(5, c.add());
	}
	
	public void toStringTest() {
		assertEquals("toString di kelas C", c.toString());
	}
}
