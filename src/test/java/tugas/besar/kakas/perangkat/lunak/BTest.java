package tugas.besar.kakas.perangkat.lunak;

import junit.framework.TestCase;

public class BTest extends TestCase {
	
	B b = new B();
	
	public void test1() {
		assertEquals("Ctor di kelas B", b);
	}
	
	public void toStringTest() {
		assertEquals("toString di kelas B", b.toString());
	}
}
