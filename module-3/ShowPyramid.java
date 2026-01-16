/*
Matthew Rozendaal
Module 3, Module 3.2 Exercise
1/15/2026
This program displays a pyramid of numbers with an @ symbol at the end of each line.
 */

public class ShowPyramid {

    public static void main(String[] args) {
        final int ROWS = 7;

        // StringBuilder to build the entire pyramid
        StringBuilder pyramid = new StringBuilder();

        // StringBuilder to build each line of the pyramid
        StringBuilder pyramidline = new StringBuilder();

        // Loop through each row
        for (int lineNumber = 0; lineNumber < ROWS; lineNumber++) {

            // Print leading spaces
            for (int begSpaces = ROWS - lineNumber; begSpaces > 1; begSpaces--) {
                pyramidline.append("  ");
            }

            // Print the left side of the pyramid
            int num = 1;
            for (int leftSide = 0; leftSide <= lineNumber; leftSide++) {
                pyramidline.append(num);
                pyramidline.append(" ");
                num *= 2;
            }

            // Print the right side of the pyramid
            num /= 4; // Adjust to start from the correct value
            for (int rightSide = 0; rightSide < lineNumber; rightSide++) {
                pyramidline.append(num);
                pyramidline.append(" ");
                num /= 2;
            }

            /* Print ending spaces, 
             the @ symbol needs to be aligned,
              so add enough spaces so that @ is at the same column. 
             (7 rows total = 31 characters width)
             This obviously depends on the number of rows you have and the number of digits printed,
             so would cause misalignment if you change the number of rows. I could automate the calculation of character width,
             but for this exercise I will keep it simple and static.
             */
            for (int endSpaces = pyramidline.length(); endSpaces < 31; endSpaces++) {
                pyramidline.append(" ");
            }

            // Print the @ symbol at the end of the line
            pyramidline.append("@\n");

            // Append the current line to the pyramid
            pyramid.append(pyramidline.toString());
            pyramidline.setLength(0); // Clear the line for the next row
        }

        // Print the entire pyramid
        System.out.print(pyramid.toString());
    }

}
