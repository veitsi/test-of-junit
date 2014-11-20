package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testAdd(){
		Calc a=new Calc(1,2);
		assertEquals(3,a.Add());
	}
}
