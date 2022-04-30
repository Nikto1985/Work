package by.kursy.buyel.javastages.stage13.C1;

public class Counter {
    public static int findAverage(int[] array){
        int summ = 0;
        for (int i = 0; i < array.length; i++){
            summ = summ + array[i];
        }
        return (summ / array.length);
    }
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
