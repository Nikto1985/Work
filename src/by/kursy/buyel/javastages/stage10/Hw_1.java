package by.kursy.buyel.javastages.stage10;

import java.util.Random;

public class Hw_1 {
    public static int dice(){
        Random random = new Random();
        int num1 = random.nextInt(6);
        int num2 = random.nextInt(6);
        int sum = num1 + num2 + 2;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(dice());
    }
}
