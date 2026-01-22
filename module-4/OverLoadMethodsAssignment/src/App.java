/*
Matthew Rozendaal
1/21/2026
Assignment 4.2
This program calculates the average of arrays of different numeric types
 */
public class App {

    public static void main(String[] args) throws Exception {
        // Test arrays of different sizes
        short[] shortArray = {1, 2, 3, Short.MAX_VALUE - 1 - 2 - 3};
        int[] intArray = {10, 20, 30, 40, Integer.MAX_VALUE - 10 - 20 - 30 - 40};
        long[] longArray = {100, 200, 300, 400, Long.MAX_VALUE - 100 - 200 - 300 - 400};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Test short average
        System.out.println("Short Array: " + OutputArray(shortArray));
        System.out.println("Average: " + formatNumber(average(shortArray)));
        System.out.println();

        // Test int average
        System.out.println("Int Array: " + OutputArray(intArray));
        System.out.println("Average: " + formatNumber(average(intArray)));
        System.out.println();

        // Test long average
        System.out.println("Long Array: " + OutputArray(longArray));
        System.out.println("Average: " + formatNumber(average(longArray)));
        System.out.println();

        // Test double average
        System.out.println("Double Array: " + OutputArray(doubleArray));
        System.out.println("Average: " + formatNumber(average(doubleArray)));
        System.out.println();
    }

    /**
     * Outputs the array in a formatted string.
     *
     * @param array the array to output
     * @return the formatted string representation of the array
     */
    private static String OutputArray(short[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append('"');
            sb.append(formatNumber(array[i]));
            sb.append('"');
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Outputs the array in a formatted string.
     *
     * @param array the array to output
     * @return the formatted string representation of the array
     */
    private static String OutputArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append('"');
            sb.append(formatNumber(array[i]));
            sb.append('"');
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Outputs the array in a formatted string.
     *
     * @param array the array to output
     * @return the formatted string representation of the array
     */
    private static String OutputArray(long[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append('"');
            sb.append(formatNumber(array[i]));
            sb.append('"');
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Outputs the array in a formatted string.
     *
     * @param array the array to output
     * @return the formatted string representation of the array
     */
    private static String OutputArray(double[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append('"');
            sb.append(formatNumber(array[i]));
            sb.append('"');
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Formats a number with commas and appropriate decimal places.
     *
     * @param number the number to format
     * @return the formatted number as a string
     */
    private static String formatNumber(Number number) {
        if (number instanceof Double) {
            return String.format("%,.2f", number);
        } else {
            return String.format("%,d", number);
        }
    }

    /**
     * Calculates the average of an array of shorts.
     *
     * @param array the array of shorts
     * @return the average as a short
     */
    public static short average(short[] array) {
        if (array.length == 0) {
            return 0;
        }
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    /**
     * Calculates the average of an array of ints.
     *
     * @param array the array of ints
     * @return the average as an int
     */
    public static int average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    /**
     * Calculates the average of an array of longs.
     *
     * @param array the array of longs
     * @return the average as a long
     */
    public static long average(long[] array) {
        if (array.length == 0) {
            return 0;
        }
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    /**
     * Calculates the average of an array of doubles.
     *
     * @param array the array of doubles
     * @return the average as a double
     */
    public static double average(double[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}
