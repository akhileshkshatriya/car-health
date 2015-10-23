package com.tcompany.puzzle.view.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.InjectMocks;

import com.tcompany.puzzle.TestCommon;

public class ViewUtilsTest extends TestCommon {

	@InjectMocks
	private ViewUtils utils = new ViewUtils();
	
	@Test
	public void testDisplayHealth() {
		String contetnt = ViewUtils.displayHealth("test-a", "test-n", HEALTH_OK);

		assertNotNull(contetnt);
		assertTrue(contetnt.contains("Name:"));
		assertTrue(contetnt.contains("test-a"));
		assertTrue(contetnt.contains("test-n"));

	}

	@Test
	public void tesDisplayOverAllHealthWithAllOKHealth() {
		String contetnt = ViewUtils.displayOverAllHealth(HEALTH_OK, HEALTH_OK, HEALTH_OK);

		assertNotNull(contetnt);
		assertTrue(contetnt.contains("Car Health:"));
		assertTrue(contetnt.contains("Engine:"));
		assertTrue(contetnt.contains("Transmission:"));
		assertTrue(contetnt.contains("Brake:"));
		assertTrue(contetnt.contains("OK"));
	}

	@Test
	public void tesDisplayOverAllHealthWithBrokenEngine() {
		String contetnt = ViewUtils.displayOverAllHealth(HEALTH_BROKEN, HEALTH_OK, HEALTH_OK);

		assertNotNull(contetnt);
		assertTrue(contetnt.contains("Car Health:"));
		assertTrue(contetnt.contains("Engine:"));
		assertTrue(contetnt.contains("Transmission:"));
		assertTrue(contetnt.contains("Brake:"));
		assertTrue(contetnt.contains("BROKEN"));
	}

	@Test
	public void tesDisplayOverAllHealthWithBrokenTransmission() {
		String contetnt = ViewUtils.displayOverAllHealth(HEALTH_OK, HEALTH_BROKEN, HEALTH_OK);

		assertNotNull(contetnt);
		assertTrue(contetnt.contains("Car Health:"));
		assertTrue(contetnt.contains("Engine:"));
		assertTrue(contetnt.contains("Transmission:"));
		assertTrue(contetnt.contains("Brake:"));
		assertTrue(contetnt.contains("BROKEN"));
	}

	@Test
	public void tesDisplayOverAllHealthWithBrokenBrake() {
		String contetnt = ViewUtils.displayOverAllHealth(HEALTH_OK, HEALTH_OK, HEALTH_BROKEN);

		assertNotNull(contetnt);
		assertTrue(contetnt.contains("Car Health:"));
		assertTrue(contetnt.contains("Engine:"));
		assertTrue(contetnt.contains("Transmission:"));
		assertTrue(contetnt.contains("Brake:"));
		assertTrue(contetnt.contains("BROKEN"));
	}

	@Test
	public void testIsCarBrokenWithAllHealthOK() {
		boolean isBroken = ViewUtils.isBroken(HEALTH_OK, HEALTH_OK, HEALTH_OK);
		assertFalse(isBroken);
	}

	@Test
	public void testIsCarBrokenWithAllEngineHealthBroken() {
		boolean isBroken = ViewUtils.isBroken(HEALTH_BROKEN, HEALTH_OK, HEALTH_OK);
		assertTrue(isBroken);
	}
	
	@Test
	public void testIsCarBrokenWithAllTransmissionHealthBroken() {
		boolean isBroken = ViewUtils.isBroken(HEALTH_OK, HEALTH_BROKEN, HEALTH_OK);
		assertTrue(isBroken);
	}
	
	@Test
	public void testIsCarBrokenWithAllBrakeHealthBroken() {
		boolean isBroken = ViewUtils.isBroken(HEALTH_OK, HEALTH_OK, HEALTH_BROKEN);
		assertTrue(isBroken);
	}
}
