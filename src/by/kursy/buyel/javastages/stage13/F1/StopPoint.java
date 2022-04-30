package by.kursy.buyel.javastages.stage13.F1;

public class StopPoint {
    public static int findStopPoint(int[] array) {
        int stop = array.length;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                stop = i;
                break;
            }
        }
        return stop;
    }
}
