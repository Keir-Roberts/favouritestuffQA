package main;

public class helicopter extends vehicles {
private int maxAltitude;
private int seats;
private String sound;
public int getMaxAltitude() {
	return maxAltitude;
}
public void setMaxAltitude(int maxAltitude) {
	this.maxAltitude = maxAltitude;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public String getSound() {
	return sound;
}
public void setSound(String sound) {
	this.sound = sound;
}
public helicopter(String manufacturer, String make, String fuelType, int maxSpeed, int maxAltitude, int seats,
		String sound) {
	super(manufacturer, make, fuelType, maxSpeed);
	this.maxAltitude = maxAltitude;
	this.seats = seats;
	this.sound = sound;
}
@Override
public String toString() {
	return "helicopter " + getMake() + " " + getManufacturer() + " [ Max Altitude = " + getMaxAltitude() + ", seats = " + getSeats() + ", sound = " + getSound() + 
		  ", Fuel type = " + getFuelType() + ", Max speed = "
			+ getMaxSpeed() + "]";
}

}
