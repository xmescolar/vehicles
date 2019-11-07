package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	//Constructor
	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	
	//Get Parameter Plate
	public String getPlate() {
		return plate;
	}

	//Set Parameter Plate
	public void setPlate(String plate) {
		this.plate = plate;
	}

	//Get Parameter Brand
	public String getBrand() {
		return brand;
	}

	//Set Parameter Brand
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//Get Parameter Color
	public String getColor() {
		return color;
	}

	//Set Parameter Color
	public void setColor(String color) {
		this.color = color;
	}

	//Get Parameter Wheels
	public List<Wheel> getWheels() {
		return wheels;
	}

	//Set Parameter Wheels
	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	
	//Composition Parameters Class Vehicle
	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", brand=" + brand + ", color=" + color + ", wheels=" + wheels + "]";
	}
	
}
