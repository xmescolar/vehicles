package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	//Constructor Class Wheel
	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	//Get Parameter Brand
	public String getBrand() {
		return brand;
	}
	//Set Parameter Brand
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//Get Parameter Diameter
	public double getDiameter() {
		return diameter;
	}

	//Set Parameter Diameter
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	//Composition Parameters Class Wheel
	@Override
	public String toString() {
		return "Wheel [brand=" + brand + ", diameter=" + diameter + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(diameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	// Implementation method equals(). 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		return true;
	}		
}
