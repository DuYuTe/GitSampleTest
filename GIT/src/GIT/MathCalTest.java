package GIT;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathCalTest {

	@Test
	void test() {
		assertEquals(7, new MathCal().add(3, 4));
	}

}
