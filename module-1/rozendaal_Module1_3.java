/*
Matthew Rozendaal
Module 1, Module 1.3 Exercise
1/13/2026
This program calculates the energy required to heat a given mass of water from an initial temperature to a final temperature.
 */
import java.util.Scanner;
public class rozendaal_Module1_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get Inputs from user
            double waterMass = GetDoubleValueFromUser("Enter the amount of water in kilograms: ", scanner);
            
            double initialTemperature = GetDoubleValueFromUser("Enter the initial temperature in Celsius: ", scanner);
            
            double finalTemperature = GetDoubleValueFromUser("Enter the final temperature in Celsius: ", scanner);
            
            // Calculate energy needed to heat the water
            // Note: Looking online most people use 4186 for specific heat capacity of water, but the assignment states to use 4184. 
            // This caused a small difference in the final answer when compared to online calculators.
            double Q = ( waterMass * (finalTemperature - initialTemperature) ) * 4184; 
            
            // Display the result
            System.out.printf("The energy needed to heat the water is %.2f Joules.", Q);
        }
    }
    /// <summary>
    /// Gets a double value from the user with input validation.
    /// </summary>
    /// <param name="promptMessage">The message to prompt the user.</param>
    /// <param name="scanner">The Scanner object for reading input.</param>
    /// <returns>The double value entered by the user.</returns>
    private static double GetDoubleValueFromUser(String promptMessage, Scanner scanner) {
        try {
            // Prompt the user and read input
            System.out.print(promptMessage);
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next(); // Clear the invalid input
        }
        // Recursively call the method until valid input is received
        return GetDoubleValueFromUser(promptMessage, scanner);
    }
}