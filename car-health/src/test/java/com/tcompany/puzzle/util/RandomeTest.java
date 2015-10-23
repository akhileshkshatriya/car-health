package com.tcompany.puzzle.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.InjectMocks;

import com.tcompany.puzzle.TestCommon;
import com.tcompany.puzzle.data.Car;


public class RandomeTest extends TestCommon{
	
	@InjectMocks
	private Randome randome = new Randome();
	
	@Test
	public void testBrakeHealthShouldBeLessOrEqualToThanHundred(){
		Car car = Randome.getRandomeCar();
		
		assertNotNull(car);
		assertTrue(car.getBrakeHealth() <= MAX_HEALTH);
	}
	
	@Test
	public void testEngineHealthShouldBeLessOrEqualToThanHundred(){
		Car car = Randome.getRandomeCar();
		
		assertNotNull(car);
		assertTrue(car.getEngineHealth() <= MAX_HEALTH);
	}
	
	@Test
	public void tesTransmissionHealthShouldBeLessOrEqualToThanHundred(){
		Car car = Randome.getRandomeCar();
		
		assertNotNull(car);
		assertTrue(car.getTransmissionHealth() <= MAX_HEALTH);
	}
	
	@Test
	public void tesTransmissionHealthShouldBeMoreToFifty(){
		Car car = Randome.getRandomeCar();
		
		assertNotNull(car);
		assertTrue(car.getTransmissionHealth() > MIN_HEALTH);
	}
	
	@Test
	public void tesEngineHealthShouldBeMoreToFifty(){
		Car car = Randome.getRandomeCar();
		
		assertNotNull(car);
		assertTrue(car.getEngineHealth() > MIN_HEALTH);
	}
	
	@Test
	public void tesBrakeHealthShouldBeMoreToFifty(){
		Car car = Randome.getRandomeCar();
		
		assertNotNull(car);
		assertTrue(car.getBrakeHealth() > MIN_HEALTH);
	}
	
	@Test
	public void testMaxHealth(){
		int number = Randome.randome();
		assertTrue(number <= MAX_HEALTH);
	}
	
	@Test
	public void testMinHealth(){
		int number = Randome.randome();
		assertTrue(number > MIN_HEALTH);
	}
}
