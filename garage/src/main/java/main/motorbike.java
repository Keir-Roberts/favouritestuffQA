package main;

public class motorbike extends vehicles {
	private int mileage;
	private String function;
	private boolean turboCharge;

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public boolean isTurboCharge() {
		return turboCharge;
	}

	public void setTurboCharge(boolean turboCharge) {
		this.turboCharge = turboCharge;
	}

	public motorbike(String manufacturer, String make, String fuelType, int maxSpeed, int mileage, String function,
			boolean turboCharge) {
		super(manufacturer, make, fuelType, maxSpeed);
		this.mileage = mileage;
		this.function = function;
		this.turboCharge = turboCharge;
	}

	@Override
	public String toString() {
		return "motorbike " + getManufacturer() + " " + getMake() + " [Mileage =" + getMileage() + ", Function =" + getFunction() + ", Turbocharge?="
				+ isTurboCharge() + ", Fuel Type()=" + getFuelType() + ", Max Speed()=" + getMaxSpeed() + "]";
	}

}
