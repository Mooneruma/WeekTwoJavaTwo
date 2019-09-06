import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.AlertLevel;

public class AlertTest1 {
	int SecureLevel = 1;
	AlertLevel alertLevel = new AlertLevel(SecureLevel);
	
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(SecureLevel, alertLevel.PrintAlert());	
	}
	
	public void testWarningLength(String warning) {
		int messageLength = warning.length();
		assertTrue(messageLength == alertLevel.TestWarningLength());
	}

}
