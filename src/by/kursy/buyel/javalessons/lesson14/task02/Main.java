package by.kursy.buyel.javalessons.lesson14.task02;

import by.kursy.buyel.javalessons.lesson14.ArraySorter;
import by.kursy.buyel.javalessons.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5 , 8 , 9 , 2, 3, 7, 4};

        Printer.print("Before sorting: \n");
        Printer.print(Arrays.toString(array));

        ArraySorter.insertedSortAcs(array);

        Printer.print("\nAfter sorting: \n");
        Printer.print(Arrays.toString(array));
    }
}
