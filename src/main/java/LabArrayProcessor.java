


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabArrayProcessor implements ArrayProcessor {


    @Override
    public double calculate(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }


    @Override
    public double calculate(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j =0; j <array.length - i; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }


    @Override
    public void processArray(double[] array) {
        for (double l :array) {
            System.out.print(l+ " ");

            }
        System.out.println();

    }

    @Override
    public void processArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

    }

    }
}




