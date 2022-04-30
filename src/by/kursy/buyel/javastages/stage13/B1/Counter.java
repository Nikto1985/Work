package by.kursy.buyel.javastages.stage13.B1;

public class Counter {
    public static int count(int[] array, int n){
        int num = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > n){
                num = num + 1;
            }
        }
        return num;
    }
}
