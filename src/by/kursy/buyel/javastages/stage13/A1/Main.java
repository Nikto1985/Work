package by.kursy.buyel.javastages.stage13.A1;

import by.kursy.buyel.javalessons.view.Printer;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];
        int min = 0;
        int max = 10;
        String out = "";

        ArrayInit.randomInit(array, min, max);

        out = "Number of values not equal 0 = " + Counter.count(array);
        Printer.print(out);
    }

}
