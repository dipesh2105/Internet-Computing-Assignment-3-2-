package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = (int) test.divide(10, 2);
		assertEquals(5, output);
	}

}
