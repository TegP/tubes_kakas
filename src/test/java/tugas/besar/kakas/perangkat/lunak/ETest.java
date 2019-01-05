package tugas.besar.kakas.perangkat.lunak;

import junit.framework.TestCase;

public class ETest extends TestCase {
	
	E e = new E();
	
	public void test1() {
		assertEquals("Ctor di kelas E", e);
	}
	
	public void toStringTest() {
		assertEquals("toString di kelas E", e.toString());
	}
}
