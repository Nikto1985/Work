package by.kursy.buyel.javalessons.lesson14;

public class ArraySorter {
    public static void bubbleSortAcs(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                boolean flag = true;
                if (array[j] > array[j + 1]){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    flag = false;
                }
                if (flag) {
                    break;
                }
            }
        }
    }
    public static void bubbleSortDecs(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                boolean flag = true;
                if (array[j] < array[j + 1]){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                    flag = false;
                }
                if (flag) {
                    break;
                }
            }
        }
    }
    public static void insertedSortAcs(int[] array){
        for (int i = 1; i < array.length; i++) {
            int buf = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > buf) {
                array[j + 1] = array[j];
                j--;

            }

            array[j + 1] = buf;
        }
    }
    public static void selectedSortAcs(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int minim = array[i];
            int index = i;
            for (int j = i; j < array.length; j++){
                if (array[j] < minim){
                    minim = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = minim;

        }
    }
}
