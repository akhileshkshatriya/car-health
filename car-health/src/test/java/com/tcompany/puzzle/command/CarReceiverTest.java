package com.tcompany.puzzle.command;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.tcompany.puzzle.TestCommon;
import com.tcompany.puzzle.data.Car;

@RunWith(MockitoJUnitRunner.class)
public class CarReceiverTest extends TestCommon {

	@InjectMocks
	private CarReceiver receiver = new CarReceiver();

	@Mock
	private Car car;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetEngineHealth() {
		when(car.getEngineHealth()).thenReturn(HEALTH_OK);
		int health = receiver.getEngineHealth();

		assertEquals(health, HEALTH_OK);
		verify(car).getEngineHealth();
	}

	@Test
	public void testGetTransmissionHealth() {
		when(car.getTransmissionHealth()).thenReturn(HEALTH_OK);
		int health = receiver.getTransmissionHealth();

		assertEquals(health, HEALTH_OK);
		verify(car).getTransmissionHealth();
	}

	@Test
	public void testGetBrakeHealth() {
		when(car.getBrakeHealth()).thenReturn(HEALTH_OK);
		int health = receiver.getBrakeHealth();

		assertEquals(health, HEALTH_OK);
		verify(car).getBrakeHealth();
	}
}
