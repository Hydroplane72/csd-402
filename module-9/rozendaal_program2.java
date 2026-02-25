
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Matthew Rozendaal Module 9.2 - Program 2 CSD 402 This program demonstrates
 * file handling in Java. It creates a file named "data.file" if it does not
 * exist, or appends to it if it does. The program writes 10 randomly generated
 * numbers to the file, separated by spaces, and then reads and displays the
 * contents of the file to the user.
 */
public class rozendaal_program2 {

    public static void main(String[] args) {
        String fileName = "data.file";
        File file = new File(fileName);

        try {
            // Create the file if it does not exist, or append to it if it does exist
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists. Appending data...");
            }

            // Write 10 randomly generated numbers to the file, separated by spaces
            try (FileWriter writer = new FileWriter(file, true)) {
                Random random = new Random();
                for (int i = 0; i < 10; i++) {
                    int number = random.nextInt(100); // Generate a random number between 0 and 99
                    writer.write(number + " ");
                }
            }

            // Read and display the contents of the file
            try (Scanner scanner = new Scanner(file)) {
                System.out.println("File contents:");
                while (scanner.hasNext()) {
                    System.out.print(scanner.next() + " ");
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
