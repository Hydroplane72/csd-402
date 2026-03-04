
/**
 * Matthew Rozendaal
 * Module 5.2 Assignment Redo
 * 01/27/2026
 */
public class Module5_2AssignmentRedo {

    public static void main(String[] args) {
        // Test with a 2D array of doubles
        double[][] doubleArray = {
            {1.5, 2.3, 3.1},
            {4.6, 5.2, 6.8},
            {7.9, 8.4, 9.0}
        };
        int[] largestDoubleLocation = locateLargest(doubleArray);
        int[] smallestDoubleLocation = locateSmallest(doubleArray);
        System.out.println("Largest double at: (" + largestDoubleLocation[0] + ", " + largestDoubleLocation[1] + ")");
        System.out.println("Smallest double at: (" + smallestDoubleLocation[0] + ", " + smallestDoubleLocation[1] + ")");

        // Test with a 2D array of integers
        int[][] intArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] largestIntLocation = locateLargest(intArray);
        int[] smallestIntLocation = locateSmallest(intArray);
        System.out.println("Largest integer at: (" + largestIntLocation[0] + ", " + largestIntLocation[1] + ")");
        System.out.println("Smallest integer at: (" + smallestIntLocation[0] + ", " + smallestIntLocation[1] + ")");
    }

    /**
     * Locates the position of the largest element in a 2D array of doubles.
     *
     * @param arrayParam The 2D array to search.
     * @return An array containing the row and column indices of the largest
     * element.
     */
    public static int[] locateLargest(double[][] arrayParam) {
        // Initialize location array to store row and column indices
        int[] location = new int[2];
        // Start with the first element as the largest
        double largest = arrayParam[0][0];
        // Iterate through all rows
        for (int i = 0; i < arrayParam.length; i++) {
            // Iterate through all columns in the current row
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Update if current element is larger than the largest found
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the position of the largest element in a 2D array of integers.
     *
     * @param arrayParam The 2D array to search.
     * @return An array containing the row and column indices of the largest
     * element.
     */
    public static int[] locateLargest(int[][] arrayParam) {
        // Initialize location array to store row and column indices
        int[] location = new int[2];
        // Start with the first element as the largest
        int largest = arrayParam[0][0];
        // Iterate through all rows
        for (int i = 0; i < arrayParam.length; i++) {
            // Iterate through all columns in the current row
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Update if current element is larger than the largest found
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the position of the smallest element in a 2D array of doubles.
     *
     * @param arrayParam The 2D array to search.
     * @return An array containing the row and column indices of the smallest
     * element.
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        // Initialize location array to store row and column indices
        int[] location = new int[2];
        // Start with the first element as the smallest
        double smallest = arrayParam[0][0];
        // Iterate through all rows
        for (int i = 0; i < arrayParam.length; i++) {
            // Iterate through all columns in the current row
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Update if current element is smaller than the smallest found
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the position of the smallest element in a 2D array of integers.
     *
     * @param arrayParam The 2D array to search.
     * @return An array containing the row and column indices of the smallest
     * element.
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        // Initialize location array to store row and column indices
        int[] location = new int[2];
        // Start with the first element as the smallest
        int smallest = arrayParam[0][0];
        // Iterate through all rows
        for (int i = 0; i < arrayParam.length; i++) {
            // Iterate through all columns in the current row
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Update if current element is smaller than the smallest found
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
