package by.kursy.buyel.javalessons.lesson13.task01;

import by.kursy.buyel.javalessons.lesson13.util.ArrayInicializer;
import by.kursy.buyel.javalessons.lesson13.util.Convertor;
import by.kursy.buyel.javalessons.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];


        ArrayInicializer.randomInit(array, -10, 10);

        Printer.print("Input value for searching: ");
        int value = scanner.nextInt();

        boolean result = LinearSearching.checkValue(array, value);
        Printer.print("\nArray " + Convertor.convertFromArrayToString(array));
        String msg = result ? "Yes" : "No";
        Printer.print("\nResult: " + msg);
    }
}
