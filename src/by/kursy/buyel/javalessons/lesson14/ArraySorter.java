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
}
