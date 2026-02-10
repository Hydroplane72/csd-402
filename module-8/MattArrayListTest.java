
/**
 * Matthew Rozendaal
 * 2/9/2025
 * Module 8
 * This program defines a class called MattArrayListTest that contains methods to find the maximum value in an ArrayList of integers and to get user input to populate the ArrayList.
 * The main method calls the GetUserInput method to populate the list and then calls the max method to find and display the maximum value.
 * There are also test cases defined in the RunTests method to verify the functionality of the max method.
 *
 * Side note: The instructions for this assignment were more than a bit confusing, Trying to figure out which "method" was being talked about during reading requirements was a challenge.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MattArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = GetUserInput();

        Integer maxValue = max(list);
        System.out.println("The value returned is: " + maxValue);
        // Run tests to verify the max method works correctly
        //RunTests(); // Uncomment this line to run the tests
    }

    private static void RunTests() {
        // Test with a list of integers
        ArrayList<Integer> testList1 = new ArrayList<>();
        testList1.add(5);
        testList1.add(10);
        testList1.add(3);
        System.out.println("Test List 1: " + testList1);
        System.out.println("Max Value: " + max(testList1)); // Expected: 10

        // Test with an empty list
        ArrayList<Integer> testList2 = new ArrayList<>();
        System.out.println("Test List 2: " + testList2);
        System.out.println("Max Value: " + max(testList2)); // Expected: 0

        // Test with negative integers
        ArrayList<Integer> testList3 = new ArrayList<>();
        testList3.add(-5);
        testList3.add(-10);
        testList3.add(-3);
        System.out.println("Test List 3: " + testList3);
        System.out.println("Max Value: " + max(testList3)); // Expected: -3
    }

    public static Integer max(ArrayList<Integer> list) {
        // Check if the list is empty and return 0 if it is
        if (list.isEmpty()) {
            return 0;
        }
        Integer maxValue = Integer.MIN_VALUE; // Initialize maxValue to the smallest possible integer
        // Iterate through the list to find the maximum value
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        // Display the largest value to the user in the method, as per the instructions.
        System.out.println("The largest value in the list is: " + maxValue);

        // Return the largest value
        return maxValue;
    }

    /**
     * This method prompts the user to enter integers and populates an ArrayList
     * with the input until the user enters 0. The method then returns the
     * populated ArrayList.
     *
     * @return the populated ArrayList.
     */
    public static ArrayList<Integer> GetUserInput() {

        ArrayList<Integer> list = new ArrayList<>();
        // Continuously read integers until the user enters 0
        try (Scanner scanner = new Scanner(System.in)) {
            // Continuously read integers until the user enters 0
            while (true) {
                int input = GetCleanIntegerFromUser("Enter integers (enter 0 to stop): ", scanner);
                list.add(input);
                if (input == 0) {
                    break;
                }
            }
        }

        // Return the populated ArrayList
        return list;
    }

    private static Integer GetCleanIntegerFromUser(String prompt, Scanner inputScanner) {
        Integer userInput = null;
        while (userInput == null) {
            System.out.print(prompt);
            String input = inputScanner.nextLine();
            try {
                userInput = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return userInput;
    }

}
