package by.kursy.buyel.javalessons.lesson13.task03;

import by.kursy.buyel.javalessons.lesson13.task01.LinearSearching;
import by.kursy.buyel.javalessons.lesson14.task02.util.ArrayInicializer;
import by.kursy.buyel.javalessons.lesson14.task02.util.Convertor;
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

        int count = LinearSearching.countValue(array, value);
        Printer.print("\nArray " + Convertor.convertFromArrayToString(array));
        String msg = String.format("Count of valuue %d = %d",value, count);
        Printer.print("\nResult: " + msg);
    }
}
