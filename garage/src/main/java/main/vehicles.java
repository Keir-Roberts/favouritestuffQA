package main;

public class vehicles {
private String manufacturer;
private String make;
private String fuelType;
private int maxSpeed;
private String manMake;

public String getManMake() {
	return manMake;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public void garageStore(Object store) {
	((garage) store).inGarage.add(this);
}
public void garageRemove(Object remove) {
	((garage) remove).inGarage.remove(((garage) remove).inGarage.indexOf(this));
}
public vehicles(String manufacturer, String make, String fuelType, int maxSpeed) {
	super();
	this.manufacturer = manufacturer;
	this.make = make;
	this.fuelType = fuelType;
	this.maxSpeed = maxSpeed;
	this.manMake = manufacturer + " " + make;
}
	

}
