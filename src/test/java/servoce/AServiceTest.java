package servoce;

import org.junit.Test;
import service.AService;

import static org.junit.Assert.assertEquals;

public class AServiceTest
{
	@Test
	public void testF() {
		AService aService = new AService();
		assertEquals(2, aService.f(1));
	}

	@Test
	public void testH() {
		AService aService = new AService();
		assertEquals(-1, aService.h(1));
	}
}