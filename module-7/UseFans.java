
/**
 * Matthew Rozendaal
 * 1/29/2026
 * CSD 402 Module 7.2
 * This program demonstrates the use of a Fan class with methods to display fan information
 * without using the toString() method.
 */
public class UseFans {

    public static void main(String[] args) {
        // Create a collection of Fan instances
        Fan[] fans = new Fan[3];
        fans[0] = new Fan(Fan.FAST, true, 10.0, "blue");
        fans[1] = new Fan(Fan.MEDIUM, false, 8.0, "red");
        fans[2] = new Fan(Fan.SLOW, true, 12.0, "green");

        // Display all fans in the collection
        Fan.displayFans(fans);

        // Display a single fan
        Fan.displayFan(fans[0]);

        // Alternatively, using instance method to display a single fan
        fans[1].displayFan();
    }

}

class Fan {

    // Constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed = STOPPED;
    private boolean on;
    private double radius = 6.0;
    private String color = "white";

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Override toString method to provide string representation of Fan instance
     */
    @Override
    public String toString() {
        if (this.on) {
            return "Fan is ON: Speed = " + this.speed + ", Radius = " + this.radius + ", Color = " + this.color;
        } else {
            return "Fan is OFF: Radius = " + this.radius + ", Color = " + this.color;
        }
    }

    /**
     * Method to display all fans in the collection without using toString()
     */
    public static void displayFans(Fan[] fans) {
        // Iterate through the array and display each fan
        for (Fan fan : fans) {
            // Use the static method to display each fan
            // Calling the static method instead of instance method because the static method checks for null
            displayFan(fan);
        }
    }

    /**
     * Method to display this fan instance without using toString()
     */
    public void displayFan() {
        if (this.isOn()) {
            System.out.println("Fan is ON: Speed = " + this.getSpeed() + ", Radius = " + this.getRadius() + ", Color = " + this.getColor());
        } else {
            System.out.println("Fan is OFF: Radius = " + this.getRadius() + ", Color = " + this.getColor());
        }
    }

    /**
     * Static method to display a single fan instance without using toString()
     */
    public static void displayFan(Fan fan) {
        // Check for null to avoid NullPointerException
        if (fan != null) {
            // Use the instance method to display the fan
            fan.displayFan();
        } else {
            // Handle null case
            System.out.println("Fan is null.");
        }
    }
}
