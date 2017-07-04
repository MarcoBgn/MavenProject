import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildTest {

	private Child child;

	@Before
	public void beforeEach() {
		child = new Child("123", "Child1", new int[]{10, 20, 30}, "33 TEST");

	}

	@Test
	public void test_assignment() {
		String expected = "Child1";

		assertEquals("Failure - Values are not equals", expected, child.getName());
	}
}

