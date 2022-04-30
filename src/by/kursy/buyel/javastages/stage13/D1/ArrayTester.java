package by.kursy.buyel.javastages.stage13.D1;

public class ArrayTester {
    public static String findTheSame(int[] array) {
        String out;
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (result == false) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        result = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        if (result == true) {
            out = "Array have some same elements\n";
        } else {
            out = "All elements of array are different\n";
        }
        return out;
    }
}
