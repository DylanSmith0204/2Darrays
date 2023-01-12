public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int counter = 0;

        for (int[] row : mat) {
            for (int cell : row) {
                if (cell % 2 != 0) {
                    counter += 1;
                }
            }
        }
        return counter;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int max = Integer.MIN_VALUE;
        for (int[] row : mat) {
            for (int cell : row) {
                if (cell > max) {
                    max = cell;
                }
            }
        }
        return max;
    }
    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int firstvalue = mat[i][0];
            for (int j = 0; j < mat[i].length; j++) {
                if (j == mat[i].length - 1) {
                    mat[i][j] = firstvalue;
                }
                else {
                    mat[i][j] = mat[i][j + 1];
                }
            }
        }
        return mat;
    }





    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] mat = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                mat[i][j] = i + j;
            }
        }
        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }


    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
            double median = 0;

            if (mat.length % 2 == 1) {
                if (mat[0].length % 2 == 1) {
                    median = mat[mat.length / 2][mat[0].length / 2];
                }
                else if (mat[0].length % 2 == 0) {
                    median = (mat[mat.length / 2][mat[0].length / 2] + mat[mat.length / 2][mat[0].length / 2 - 1]) / 2;
                }
            }
            else {
                median = (mat[mat.length / 2][0] +
                        mat[mat.length / 2  - 1][mat[0].length - 1]) / 2;

            }
       return median;
    }





    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int maxCount = 0;
        double mode = mat[0][0];
        int count = 1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                for (int x = 0; x < mat[i].length; x++) {
                    if (mat[i][j] == mat[i][x]) {
                        count++;
                    } else {
                        if (count > maxCount) {
                            maxCount = count;
                            mode = mat[i][j];
                        }
                        count = 1;
                    }
                }
            }
        }
        return mode;

    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
