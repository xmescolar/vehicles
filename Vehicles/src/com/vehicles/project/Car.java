package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {
	//Constructor Vehicle
	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	//Composition Parameters Class Car
	@Override
	public String toString() {
		return "Values of Car: " + '\n' +
				"plate= " + plate + '\n' +
				"brand= " + brand + '\n' +
				"color= " + color + '\n' + 
				"wheels= [" + wheels + "]";
	}
	
	//Method add all wheels in a car
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}
	
	//Method add 2 wheels in a car
	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

}
