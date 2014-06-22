package se.anton.slumptal;

import static org.junit.Assert.assertTrue;

import org.junit.*;

public class SlumptalsgeneratorTest {

	private Slumptalsgenerator sut;

	@Before
	public void init() {
		sut = new Slumptalsgenerator();
	}
	
	@Test
	public void generera() {
		int result = sut.generera(1, 100);

		assertTrue(result > 0 && result < 101);
	}
	
}
