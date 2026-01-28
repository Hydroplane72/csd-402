
/**
 * Example class to demonstrate attribute access and modification.
 */
public class AttributeAccessModificationExample {

    public static void main(String[] args) {

        // Create an instance of the Example class
        Example example = new Example("Initial Value");

        // Access and display the initial attribute value
        System.out.println("Initial Attribute Value: " + example.attribute);

        // Modify the attribute value
        example.attribute = "Modified Value";

        // Access and display the modified attribute value
        System.out.println("Modified Attribute Value: " + example.attribute);
    }
}

/**
 * Example class to demonstrate attribute access and modification.
 */
class Example {

    /**
     * The attribute of the example.
     */
    String attribute;

    /**
     * Constructor to initialize the Example object.
     *
     * @param attribute sets the attribute of the example.
     *
     */
    public Example(String attribute) {
        this.attribute = attribute;
    }
}
