
/**
 * Matthew Rozendaal
 * Module 5.2 Assignment
 * 01/27/2026
 */

public class Module5_2Assignment {

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
