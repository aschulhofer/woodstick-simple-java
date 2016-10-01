package at.woodstick.simplejava;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class AppTest {
	
	private App app;
	
	@Before
	public void setUp() {
		app = new App();
	}
	
	@After
	public void tearDown() {
		app = null;
	}
	
	@Test
	public void shouldHaveLogger() {
		Assert.assertTrue(app.hasLogger());
	}
}
