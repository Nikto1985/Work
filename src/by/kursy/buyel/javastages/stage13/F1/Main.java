package by.kursy.buyel.javastages.stage13.F1;

import by.kursy.buyel.javalessons.view.Printer;
import by.kursy.buyel.javastages.stage13.A1.ArrayInit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];
        int min = 0;
        int max = 10;
        int stop = 0;

        ArrayInit.randomInit(array, min, max);
        Printer.print("Array before sorting = ");
        Printer.print(Arrays.toString(array));

        stop = StopPoint.findStopPoint(array);
        ArraySorter.insertedSortAcs(array, stop);

        Printer.print("\nAfter sorting: ");
        Printer.print(Arrays.toString(array));

    }
}
