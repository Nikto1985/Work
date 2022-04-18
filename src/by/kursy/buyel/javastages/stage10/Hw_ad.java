package by.kursy.buyel.javastages.stage10;
import java.util.Random;

public class Hw_ad {
    public static String msg = "";
    public static void main(String[] argd){
        Random random = new Random();
        int date = random.nextInt(31) + 1;
        int month = random.nextInt(12) + 1;
        int year = random.nextInt(3000);
        if (testDate(date, month, year)){
            System.out.printf("Current date %d %d %d\n", date, month, year);
            System.out.println(msg);
        } else {
            System.out.printf("Date is incorrect: %d %d %d", date, month, year);
        }
    }
    public static boolean testDate(int date, int month, int year){
        int newDay;
        int newMonth;
        int newYear;
        boolean vis = false;
        int maxDays = 0;
        boolean trueDate;
        if (year % 400 == 0) {
            vis = true;
        } else if (year % 100 == 0) {
            vis = false;
        } else if (year % 4 == 0) {
            vis = true;
        } else {
            vis = false;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDays = 31;
                break;
            case 2:
                if (vis == true){
                    maxDays = 29;
                    break;
                } else {
                    maxDays = 28;
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
        }
        if ((date <= maxDays) && (date > 0) && (month <= 12) && (month > 0) && (year > 0)) {
            trueDate = true;
        } else {
            trueDate = false;
        }
        newDay = date + 1;
        newMonth = month;
        newYear = year;
        if (newDay > maxDays){
            newDay = 1;
            newMonth = newMonth + 1;
            if (newMonth > 12){
                newMonth = 1;
                newYear = newYear + 1;
            }
        }
        msg = "New date:" + newDay + " " + newMonth + " " + newYear;
        return  trueDate;
    }

}
