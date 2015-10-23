package com.tcompany.puzzle.command;

import com.tcompany.puzzle.data.Car;
import com.tcompany.puzzle.util.Randome;

public class CarReceiver {
	
	private Car car;
	
	public CarReceiver() {
		this.car = Randome.getRandomeCar();
	}

	public int getEngineHealth() {
		return car.getEngineHealth();
	}

	public int getTransmissionHealth() {
		return car.getTransmissionHealth();
	}

	public int getBrakeHealth() {
		return car.getBrakeHealth();
	}

}
