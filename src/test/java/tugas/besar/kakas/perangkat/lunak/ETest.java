package tugas.besar.kakas.perangkat.lunak;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ETest {
	
	private E e;
	private List<String> testList = new ArrayList<String>();
	
//	public void test1() {
//		assertEquals("Ctor di kelas E", e);
//	}
	
	@Before
	public void setUp() throws Exception {
		e = new E();
		testList.add("Test Data");
	}
	
	@Test
	public void toStringTest() {
		assertEquals("toString di kelas E", e.toString());
	}
}
