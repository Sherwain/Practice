package object.com;

public class Bicycle {
    
    // the Bicycle class has three fields
    private int cadence;
    private int gear;
    private int speed;
    protected int height;
    int length;
        
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear, int height, int length) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        this.height = height;
        this.setLength(length);
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
     
    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
            + " with a cadence of " + this.cadence +
            " and travelling at a speed of " + this.speed + 
            " height is " + this.height + " length is " + this.getLength() + ".");
    }

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}