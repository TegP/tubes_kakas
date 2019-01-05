package tugas.besar.kakas.perangkat.lunak;

import junit.framework.TestCase;

public class DTest extends TestCase {
	
	D d = new D();
	
	public void test1() {
		assertEquals("Ctor di kelas D", d);
	}
	
	public void test2() {
		assertEquals("toString di kelas D", d.toString());
	}
}
