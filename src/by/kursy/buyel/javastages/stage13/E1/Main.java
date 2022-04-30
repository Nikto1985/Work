package by.kursy.buyel.javastages.stage13.E1;

import by.kursy.buyel.javalessons.view.Printer;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[20];
        int min = 0;
        int max = 20;
        int[] arrayIndex = new int[2];

        ArrayInit.randomInit(array, min, max);
        arrayIndex = Math.findArrayMaxMin(array);

        Printer.print(Math.multiplyArray(array, arrayIndex));

    }
}
