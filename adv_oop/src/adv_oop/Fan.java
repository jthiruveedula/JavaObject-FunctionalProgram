package adv_oop;

public class Fan {
	//State of the object
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 2);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {

		this.speed = speed;

	}

	@Override
	public String toString() {
		return String.format("make:- %s,radius:- %f,color:- %s,isOn:- %s,speed:- %d", make, radius, color, isOn, speed);
	}

}
