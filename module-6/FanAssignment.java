
/**
 * Matthew Rozendaal
 * 01/27/2026
 * Module 6.2 Assignment
 * This program defines a Fan class with properties and methods to manage fan speed, state, radius, and color.
 * It also includes a main method to create and display two Fan objects.
 */
public class FanAssignment {

    /**
     * Runs the demonstration by configuring and printing two fans.
     *
     * @param args command-line arguments (not used)
     */
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

/**
 * Represents a ceiling fan with speed, power state, radius, and color.
 */
class Fan {

    /**
     * Speed constant for a stopped fan.
     */
    public static final int STOPPED = 0;
    /**
     * Speed constant for a slow fan.
     */
    public static final int SLOW = 1;
    /**
     * Speed constant for a medium fan.
     */
    public static final int MEDIUM = 2;
    /**
     * Speed constant for a fast fan.
     */
    public static final int FAST = 3;

    /**
     * Current speed setting.
     */
    private int speed = STOPPED;
    /**
     * Whether the fan is powered on.
     */
    private boolean on;
    /**
     * Fan radius in inches.
     */
    private double radius = 6.0;
    /**
     * Fan color.
     */
    private String color = "white";

    /**
     * Creates a fan with default settings: stopped, off, 6.0 radius, white
     * color.
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    /**
     * Creates a fan with the provided settings.
     *
     * @param speed initial speed
     * @param on initial power state
     * @param radius initial radius
     * @param color initial color
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * Gets the current speed.
     *
     * @return the speed value
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the current speed.
     *
     * @param speed the new speed value
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Indicates whether the fan is on.
     *
     * @return {@code true} if on; otherwise {@code false}
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Sets the power state.
     *
     * @param on {@code true} to turn on; {@code false} to turn off
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Gets the fan radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the fan radius.
     *
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the fan color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the fan color.
     *
     * @param color the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns a formatted string describing the fan state.
     *
     * @return fan description
     */
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON: Speed = " + speed + ", Radius = " + radius + ", Color = " + color;
        } else {
            return "Fan is OFF: Radius = " + radius + ", Color = " + color;
        }
    }
}
