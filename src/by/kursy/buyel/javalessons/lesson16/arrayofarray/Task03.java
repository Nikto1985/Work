package by.kursy.buyel.javalessons.lesson16.arrayofarray;

import java.util.Random;

public class Task03 {
    private static final Random RND = new Random();
    private static final int MAX_GROUP_NUMBERS = 10;
    private static final int MIN_STUDENT_NUMBERS = 2;
    private static final int MIN_GROUPE_NUMBER = 2;
    private static final int MAX_STUDENT_NUMBERS = 10;
    private static final int MAX_MARK = 10;
    private static final int MIN_MARK = 4;

    public static int[][] createGroups(){
        int[][] groups = new int[RND.nextInt(MAX_GROUP_NUMBERS - MIN_GROUPE_NUMBER + 1) + MIN_GROUPE_NUMBER][];

        for (int i = 0; i < groups.length; i++) {
            groups[i] = new int[RND.nextInt(MAX_STUDENT_NUMBERS - MIN_STUDENT_NUMBERS + 1) + MIN_STUDENT_NUMBERS];
        }
        return groups;
    }
    public static void showAllGroups(int[][] groups) {
        for (int i = 0; i < groups.length; i++) {
            System.out.print("Group[" + (i + 1) + "]");
            for (int j = 0; j < groups[i].length; j++) {
                System.out.print(groups[i][j] + " ");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
//        int[][] groups = createGroups();
//        showAllGroups(groups);
//        init(groups);
//        showAllGroups(groups);
        int[] ar = new int[390_000_001];



    }
    public static void init(int[][] groups){
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                groups[i][j] = RND.nextInt(MAX_MARK - MIN_MARK + 1) + MIN_MARK;
            }
        }
    }
    public static int findBestGroupIndex(int[][] groups){
        int iMax = 0;
        double avgMax = Integer.MIN_VALUE;

        for (int i = 0; i < groups.length; i++) {
            int sum = 0;

            for (int j = 0; j < groups[i].length; j++) {
                sum += groups[i][j];
            }
            double avg = sum / groups[i].length;
            if (avgMax < avg) {
                avgMax = avg;
                iMax = i;
            }

        }
        return iMax;
    }
}
