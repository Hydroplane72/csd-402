
/**
 * Matthew Rozendaal
 * 01/27/2026
 * Module 6.2 Assignment
 * This program defines a Fan class with properties and methods to manage fan speed, state, radius, and color.
 * It also includes a main method to create and display two Fan objects.
 */
public class FanAssignment {

    public static void main(String[] args) {
        // Create a Fan object using the no-argument constructor
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(7.5);
        fan1.setColor("blue");

        // Create a Fan object using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, false, 10.0, "red");

        // Display the state of both fans
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
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
        return speed;
    }

    public void setSpeed(int speed) {
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
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON: Speed = " + speed + ", Radius = " + radius + ", Color = " + color;
        } else {
            return "Fan is OFF: Radius = " + radius + ", Color = " + color;
        }
    }
}
