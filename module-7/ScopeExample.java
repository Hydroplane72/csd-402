
/**
 * Demonstrates variable scope in Java: Block, Local, Instance, and Static Variables.
 */
public class ScopeExample {

    // Static variable
    static int staticVar = 10;
    // Instance variable
    int instanceVar = 20;

    /**
     * Demonstrates variable scope within the class.
     *
     * Block Variable: declared within a block (e.g., inside an if statement)
     * Local Variable: declared within a method Instance Variable: declared
     * within the class but outside any method Static Variable: declared with
     * the static keyword within the class
     */
    public void demonstrateScope() {
        // Local variable
        int localVar = 30;

        if (localVar > 20) {
            // Block variable
            int blockVar = 40;
            System.out.println("Block Variable: " + blockVar);
        }

        // Uncommenting the next line would cause a compile-time error
        // because blockVar is not accessible outside its block.
        // System.out.println("Block Variable: " + blockVar);
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + this.instanceVar);
        System.out.println("Static Variable: " + ScopeExample.staticVar);
    }
}
