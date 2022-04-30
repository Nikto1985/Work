package by.kursy.buyel.javastages.stage13.A1;

public class Counter {
    public static int count(int[] array){
        int num = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != 0){
                num = num + 1;
            }
        }
        return num;
    }
}
