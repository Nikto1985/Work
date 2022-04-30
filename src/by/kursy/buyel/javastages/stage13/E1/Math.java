package by.kursy.buyel.javastages.stage13.E1;

public class Math {


    public static int[] findArrayMaxMin(double[] array) {
        int[] arrayIndex = new int[2];
        double minArray = array[0];
        double maxArray = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minArray){
                minArray = array[i];
                arrayIndex[0] = i;
            }
            if (array[i] > maxArray){
                maxArray = array[i];
                arrayIndex[1] = 0;
            }
        }
        return arrayIndex;
    }
    public static String multiplyArray(double[] array, int[] arrayIndex){
        String msg = "";
        int start = 0;
        int stop = 0;
        double multiply = 1;
        if (arrayIndex[0] < arrayIndex[1]){
            start = arrayIndex[0];
            stop = arrayIndex[1];
        } else {
            start = arrayIndex[1];
            stop = arrayIndex[0];
        }
        for (int i = start + 1; i < stop; i++){
            multiply = multiply * array[i];
        }
        msg = "\nMultiplication of array elements = " + multiply +"\n";
        return msg;
    }
}
