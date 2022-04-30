package by.kursy.buyel.javastages.stage13.D1;

import by.kursy.buyel.javalessons.view.Printer;
import by.kursy.buyel.javastages.stage13.A1.ArrayInit;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        int min = 0;
        int max = 100;

        ArrayInit.randomInit(array, min, max);
        Printer.print(ArrayTester.findTheSame(array));
    }
}
