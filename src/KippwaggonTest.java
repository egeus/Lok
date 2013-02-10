import static org.junit.Assert.*;

import org.junit.*;

public class KippwaggonTest {
	private static Kippwaggon Kippwaggon;

	@Before
	// Vor jeder Testmethode wird erstmal diese hier aufgerufen um einen neuen
	// Waggon zu bekommen
	public void generateKippwaggon() { // diese Methode MUSS public sein
		System.out.println("Erstelle neuen Waggon");
		Kippwaggon = new Kippwaggon(1000, 10);
	}

	// Wie kann ein Konstruktor getestet werden?
	// @Test
	// public void testKippwaggon() {
	// fail("Not yet implemented");
	// }

	@Test
	public void testBeladen() {
		assertEquals(Kippwaggon.beladen(0), true);
		assertEquals(Kippwaggon.beladen(1000), true);
		assertEquals(Kippwaggon.beladen(1), false);
		assertEquals(Kippwaggon.beladen(0), true);
		Kippwaggon.kippen();
		assertEquals(Kippwaggon.beladen(0), false);
	}

	@Test
	public void testKippen() {
		assertEquals(Kippwaggon.isGekippt(), false);
		Kippwaggon.kippen();
		assertEquals(Kippwaggon.isGekippt(), true);
	}

	@Test
	public void testAufrichten() {
		assertEquals(Kippwaggon.isGekippt(), false);
		Kippwaggon.kippen();
		Kippwaggon.aufrichten();
		assertEquals(Kippwaggon.isGekippt(), false);
	}

	@Test
	public void testIsGekippt() {
		assertEquals(Kippwaggon.isGekippt(), false);
		Kippwaggon.kippen();
		assertEquals(Kippwaggon.isGekippt(), true);
		Kippwaggon.aufrichten();
		assertEquals(Kippwaggon.isGekippt(), false);
	}

	@Test
	public void testGetLeergewichtKg() {
		assertNotNull(Kippwaggon.getLeergewichtKg());
		assertEquals(Kippwaggon.getLeergewichtKg(), 10, 0);
	}

}
