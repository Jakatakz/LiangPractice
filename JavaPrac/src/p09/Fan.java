package p09;

public class Fan {

	private final static int SLOW = 1;
	private final static int MEDIUM = 2;
	private final static int FAST = 3;
	
	//default values
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan()
	{
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed>=1 && speed<=3)
			this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius >= 1 && radius <= 10)
			this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		String result;
		if (isOn() == true)
			result = "fan speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " 
			+ getRadius();
		else
			result = "fan color: " + getColor() + "\nRadius: " + getRadius() + "\nFan is off";
		return result;
			
	}
	
	
	
}
