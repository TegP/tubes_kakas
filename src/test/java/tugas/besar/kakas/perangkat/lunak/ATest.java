package tugas.besar.kakas.perangkat.lunak;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ATest {
//	A a = new A();
	
	private A a;

//	@Test
//	public void test1() {
//		assertEquals("Ctor di kelas A", a);
//	}
	
	@Before
	public void setUp() throws Exception {
		a = new A();
	}
	
	@Test
	public void addTest() {
		int result = a.add(2, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void subTest() {
		int result = a.sub(6, 2);
		assertEquals(4, result);
	}
	
	@Test
	public void toStringTest() {
		assertEquals("toString di kelas A", a.toString());
	}
}
