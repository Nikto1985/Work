package by.kursy.buyel.javalessons.lesson14.task02.util;

import java.util.Random;
import java.util.Scanner;

public class ArrayInicializer {
    public static void randomInit(int[] array, int min, int max){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(max-min+1) + min;
        }
    }
    public static void consoleInit(int[] array){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
}
