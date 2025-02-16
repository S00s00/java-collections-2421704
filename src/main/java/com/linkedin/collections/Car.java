package com.linkedin.collections;

import java.util.Objects;

public class Car {

	private String make;

	private String model;

	private int mileage;

	public Car(String make, String model, int mileage) {
		super();
		this.make = make;
		this.model = model;
		this.mileage = mileage;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.make);
        hash = 17 * hash + Objects.hashCode(this.model);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
		Car c =  (Car) obj;
		System.out.format("Comparing %s %s with %s %s %n", this.make,this.model,c.make,c.model);
		
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (!Objects.equals(this.make, other.make)) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

	
	
}
