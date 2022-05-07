package by.kursy.buyel.javalessons.lesson14.task02.util;

public class Convertor {
    public static String convertFromArrayToString(int[] array){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result +=array[i] + " ";
        }
        return result;
    }
}
