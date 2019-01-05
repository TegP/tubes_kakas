package tugas.besar.kakas.perangkat.lunak;

import junit.framework.TestCase;

public class ATest extends TestCase {
	
	A a = new A();
	
	public void test1() {
		assertEquals("Ctor di kelas A", a);
	}
	
	public void toStringTest() {
		assertEquals("toString di kelas A", a.toString());
	}
	
}
