
/**
 * Provides an example of creating and using an Animal class in Java.
 */
public class AnimalExample {

    public static void main(String[] args) {

        // Create an instance of the Animal class
        // myAnimal is also known as an object
        Animal myAnimal = new Animal("Short", "Brown", 4, true);

        // Display the properties of the animal
        System.out.println(myAnimal.toString());
    }
}

/**
 * Animal class with properties for hair, eyes, legs, and tail.
 */
class Animal {

    //hair, eyes, legs, and tail attributes
    String Hair;
    String Eyes;
    int Legs;
    boolean Tail;

    // Constructor to initialize the Animal object
    public Animal(String hair, String eyes, int legs, boolean tail) {
        this.Hair = hair;
        this.Eyes = eyes;
        this.Legs = legs;
        this.Tail = tail;
    }

    // Override the toString method for easy display
    @Override
    public String toString() {
        return "Animal [Hair=" + Hair + ", Eyes=" + Eyes + ", Legs=" + Legs + ", Tail=" + Tail + "]";
    }

}
