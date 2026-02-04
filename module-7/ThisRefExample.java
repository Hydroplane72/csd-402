
/**
 * Demonstrates use of {@code this} to reference instance members.
 */
public class ThisRefExample {

    private int value;

    /**
     * Creates an instance with the provided value.
     *
     * @param value the initial value
     */
    public ThisRefExample(int value) {
        this.value = value; // 'this.value' refers to the instance variable, 'value' refers to the parameter
    }

    /**
     * Returns the current value.
     *
     * @return the current value
     */
    public int getValue() {
        return this.value; // 'this' is optional here, but used for clarity
    }

    /**
     * Updates the current value.
     *
     * @param value the new value
     */
    public void setValue(int value) {
        this.value = value; // Again, 'this.value' is the instance variable
    }
}
