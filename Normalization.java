package interview1;

import java.util.Arrays;
import java.util.Random;

public class Normalization {
    public static void main(String[] args) {
        Random random = new Random();
        int[] dataArray = new int[500];
        double[] normalizedArray = new double[500];
        int xmin = Integer.MAX_VALUE;
        int xmax = Integer.MIN_VALUE;

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = random.nextInt(10000) + 1;

            // Update xmin and xmax
            if (dataArray[i] < xmin) xmin = dataArray[i];
            if (dataArray[i] > xmax) xmax = dataArray[i];

            // Calculate and store normalized values
            for (int j = 0; j <= i; j++) {
                normalizedArray[j] = (double) (dataArray[j] - xmin) / (xmax - xmin);
            }

            System.out.println("Data Set (" + (i + 1) + " elements): " + Arrays.toString(Arrays.copyOfRange(dataArray, 0, i + 1)));
            System.out.println("Normalization: " + Arrays.toString(Arrays.copyOfRange(normalizedArray, 0, i + 1)));
        }
    }
}
