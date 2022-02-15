package main;

public class car extends vehicles {
private int seatNum;
private boolean automatic;
private int storageSpace;

public int getSeatNum() {
	return seatNum;
}

public void setSeatNum(int seatNum) {
	this.seatNum = seatNum;
}

public boolean isAutomatic() {
	return automatic;
}

public void setAutomatic(boolean automatic) {
	this.automatic = automatic;
}

public int getStorageSpace() {
	return storageSpace;
}

public void setStorageSpace(int storageSpace) {
	this.storageSpace = storageSpace;
}

public car(String manufacturer, String make, String fuelType, int maxSpeed, int seatNum, boolean automatic, int storageSpace) {
	super(manufacturer, make, fuelType, maxSpeed);
	this.seatNum = seatNum;
	this.automatic = automatic;
	this.storageSpace = storageSpace;
}

@Override
public String toString() {
	return "car " + getManufacturer() + " " + getMake() + "  [ Number of Seats =" + getSeatNum() + ", automatic =" + automatic + ", storageSpace=" + storageSpace
			+ ", Fuel Type ="
			+ getFuelType() + ", Max Speed =" + getMaxSpeed() + "]";
}

}
