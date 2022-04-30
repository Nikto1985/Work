package by.kursy.buyel.javastages.stage13.B1;

import by.kursy.buyel.javalessons.view.Printer;
import by.kursy.buyel.javastages.stage13.A1.ArrayInit;
import by.kursy.buyel.javastages.stage13.B1.Counter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input your number between 0..10\n");
        int n = scanner.nextInt();
        int[] array = new int[50];
        int min = 0;
        int max = 10;
        String out = "";

        ArrayInit.randomInit(array, min, max);

        out = "Number of values large then " + n + " = " + Counter.count(array, n);
        Printer.print(out);
    }

}
