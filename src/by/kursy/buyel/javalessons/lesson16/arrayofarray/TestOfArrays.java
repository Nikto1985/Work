package by.kursy.buyel.javalessons.lesson16.arrayofarray;

public class TestOfArrays {
    public static void main(String[] args) {
        int[][] arrays = new int[10][];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new int[(i + 1) * 2];

        }
    }
}
