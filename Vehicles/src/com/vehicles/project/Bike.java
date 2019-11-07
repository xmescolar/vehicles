package com.vehicles.project;

import java.util.List;
import java.util.Scanner;

public class Bike extends Vehicle {
	//Constructor Bike
	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void type_plate(String plate) {
		
		System.out.println("Type a plate [9999ABC]:");
	    Scanner in_plate = new Scanner(plate);
	    in_plate.close();
	}

	//Composition Parameters Class Bike
	@Override
	public String toString() {
		return "Values of Bike: " + '\n' + 
				"plate= " + plate + ", " + '\n' +
				"brand= " + brand + '\n' +
				"color= " + color + '\n' +
				"wheels= [" + '\n' +
				 wheels + "]";
	}
	
	//Method add 2 wheels in a bike
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
