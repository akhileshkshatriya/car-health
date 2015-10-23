package com.tcompany.puzzle.util;

import java.util.Random;

import com.tcompany.puzzle.data.Car;

public class Randome {
	
	private static Random rnd = new Random();
	
	public static Car getRandomeCar(){
		Car car = new Car();
		car.setBrakeHealth(randome());
		car.setEngineHealth(randome());
		car.setTransmissionHealth(randome());
		return car;
	}
	
	protected static int randome() {
		int low = 50;
		int high = 100;
		return rnd.nextInt(high-low)+low;
	}
}
