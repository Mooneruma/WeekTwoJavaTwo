import static org.junit.Assert.*;
import model.AlertLevel;
import org.junit.Before;
import org.junit.Test;

public class AlertTest2 {
	int SecureLevel = 3;
	AlertLevel alertLevel = new AlertLevel(SecureLevel);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(alertLevel.PrintAlert());
	}

}
