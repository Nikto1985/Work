package by.kursy.buyel.javastages.stage13.E1;

import java.util.Random;

public class ArrayInit {
    public static void randomInit(double[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextDouble(max - min + 1) + min;
        }
    }
}
