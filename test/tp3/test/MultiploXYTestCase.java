package tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp3.MultiploXY;

class MultiploXYTestCase {

	@Test
	void test1() {
		MultiploXY multiploXY = new MultiploXY();
		assertEquals(-1, multiploXY.mayorMultiplo (2000, 3));
	}
	
	@Test
	void test2() {
		MultiploXY multiploXY = new MultiploXY();
		assertEquals(999, multiploXY.mayorMultiplo(3, 9));
	}

}
