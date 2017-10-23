import org.junit.Test;
import static org.junit.Assert.*;

import srh89.Exercise3;

public class Exercise3Test {
	
	@Test
	public void testTriangle0() {
		assertEquals(Exercise3.triangle(1), 1);
	}

	@Test
	public void testTriangle1() {
		assertEquals(Exercise3.triangle(3), 6);
	}

	@Test
	public void testTriangle2() {
		assertEquals(Exercise3.triangle(5), 15);
	}

	@Test
	public void testLazy0() {
		assertEquals(Exercise3.lazy(1), 2);
	}
	
	@Test
	public void testLazy1() {
		assertEquals(Exercise3.lazy(3), 7);
	}
	
	@Test
	public void testLazy2() {
		assertEquals(Exercise3.lazy(10), 56);
	}
}
