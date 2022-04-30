package by.kursy.buyel.javastages.stage13.C1;

import by.kursy.buyel.javalessons.view.Printer;
import by.kursy.buyel.javastages.stage13.A1.ArrayInit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[500];
        int min = 0;
        int max = 100;
        String out = "";

        ArrayInit.randomInit(array, min, max);
        int n = Counter.findAverage(array);

        out = "Number of values large then " + n + " = " + Counter.count(array, n);
        Printer.print(out);
    }

}
