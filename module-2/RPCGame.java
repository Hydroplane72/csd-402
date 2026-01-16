/*
Matthew Rozendaal
Module 2, Module 2.2 Exercise
1/15/2026
This program simulates a Rock-Paper-Scissors game between the user and the computer.
 */

import java.util.Random;
import java.util.Scanner;

public class RPCGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            // Generate computer's choice
            int computerChoice = random.nextInt(3) + 1; // 1 to 3

            // Prompt user for their choice
            int userChoice = GetIntValueFromUser("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors): ", scanner);

            // Display choices
            System.out.println("Computer chose: " + choiceToString(computerChoice));
            System.out.println("You chose: " + choiceToString(userChoice));

            // Determine and display the result
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }
    }

    private static String choiceToString(int choice) {
        return switch (choice) {
            case 1 ->
                "Rock";
            case 2 ->
                "Paper";
            case 3 ->
                "Scissors";
            default ->
                "Invalid choice";
        };
    }

    private static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3) // Rock beats Scissors
                || (userChoice == 2 && computerChoice == 1) // Paper beats Rock
                || (userChoice == 3 && computerChoice == 2)) // Scissors beats Paper 
        {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    /// <summary>
    /// Gets a double value from the user with input validation.
    /// </summary>
    /// <param name="promptMessage">The message to prompt the user.</param>
    /// <param name="scanner">The Scanner object for reading input.</param>
    /// <returns>The double value entered by the user.</returns>
    private static int GetIntValueFromUser(String promptMessage, Scanner scanner) {
        try {
            // Prompt the user and read input
            System.out.print(promptMessage);
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next(); // Clear the invalid input
        }
        // Recursively call the method until valid input is received
        return GetIntValueFromUser(promptMessage, scanner);
    }
}
