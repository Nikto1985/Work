package by.kursy.buyel.javastages.stage13.F1;

public class ArraySorter {
    public static void insertedSortAcs(int[] array, int stop){
        for (int i = 1; i < stop; i++) {
            int buf = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > buf) {
                array[j + 1] = array[j];
                j--;

            }

            array[j + 1] = buf;
        }
    }
}
