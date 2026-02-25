
/** Matthew Rozendaal
 * Module 9.2 - Program 1
 * CSD 402
 * This program demonstrates the use of an ArrayList and exception handling in Java. 
 * It initializes an ArrayList with 10 string elements, displays them to the user, and prompts the user to select an element by its index. 
 * The program handles potential exceptions that may arise from invalid input or out-of-bounds access, ensuring a robust user experience.
 */
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class rozendaal_program1 {

    public static void main(String[] args) {
        displayArrayList();
    }

    private static void displayArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Programming");
        list.add("ArrayList");
        list.add("Exception");
        list.add("Handling");
        list.add("String");
        list.add("Collection");
        list.add("Loop");
        list.add("Autoboxing");
        list.add("OutOfBounds");

        System.out.println("ArrayList elements:");
        int tempIndex = 0;
        for (String element : list) {
            System.out.println(tempIndex + ": " + element);
            tempIndex++;
        }

        // Prompt the user for input and handle exceptions
        try (Scanner scanner = new Scanner(System.in)) {
            // Retry the input process until a valid index is provided
            while (true) {

                // Using try-with-resources to ensure the Scanner is closed properly
                // Auto-unboxing will occur when parsing the input string to an integer
                System.out.print("\nWhich element would you like to see again? (Enter index 0-9): ");
                String input = scanner.nextLine();
                try {
                    int index = Integer.parseInt(input); // Auto-unboxing from String to int
                    System.out.println("Element at index " + index + ": " + list.get(index));
                    break; // Exit the loop if a valid index is provided
                } catch (NumberFormatException e) {
                    System.out.println("Exception has been thrown: Invalid input format, please enter a number.");
                } catch (IndexOutOfBoundsException | NoSuchElementException e) {
                    System.out.println("Exception has been thrown: Out of Bounds, please enter a number between 0 and " + (list.size() - 1) + ".");
                }
            }
        }
    }
}
