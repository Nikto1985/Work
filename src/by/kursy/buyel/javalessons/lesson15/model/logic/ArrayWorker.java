package by.kursy.buyel.javalessons.lesson15.model.logic;

public class ArrayWorker {
    public static void reverse(int[] array){
        if (array == null){
            return;
        }
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
