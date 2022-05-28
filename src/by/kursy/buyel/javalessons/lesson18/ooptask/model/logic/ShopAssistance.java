package by.kursy.buyel.javalessons.lesson18.ooptask.model.logic;

import by.kursy.buyel.javalessons.lesson18.ooptask.model.entity.Bouquet;
import by.kursy.buyel.javalessons.lesson18.ooptask.model.entity.Flower;

public class ShopAssistance {
    public static double LABOR_PERCENT = 0.1;

    public static double calculateTotalPrice(Bouquet bouquet) {

        if (bouquet == null || bouquet.size() == 0) {
            return 0;
        }

        double total = 0;

        for (int i = 0; i < bouquet.size(); i++) {
            total += bouquet.get(i).getPrice();
        }

        return total + total * LABOR_PERCENT;
    }

    public static double calculateTotalWeight(Bouquet bouquet) {

        if (bouquet == null || bouquet.size() == 0) {
            return 0;
        }

        double total = 0;

        for (int i = 0; i < bouquet.size(); i++) {
            total += bouquet.get(i).getWeight();
        }

        return total;
    }

    private static int getMaxLength(Bouquet bouquet) {
        int max = bouquet.get(0).getLength();

        for (int i = 0; i < bouquet.size(); i++) {
            if (max < bouquet.get(i).getLength()) {
                max = bouquet.get(i).getLength();
            }
        }
        return max;
    }

    private static int countFlowersWithMaxLength(Bouquet bouquet, int maxLength) {
        int count = 0;

        for (int i = 0; i < bouquet.size(); i++) {
            if (bouquet.get(i).getLength() == maxLength) {
                count++;
            }
        }

        return count;
    }

    public static Flower[] findFlowersWithMaxLength(Bouquet bouquet) {
        int maxLength = getMaxLength(bouquet);
        int count = countFlowersWithMaxLength(bouquet, maxLength);

        Flower[] result = new Flower[count];

        int i = 0;
        for (; i < bouquet.size(); i++) {
            if (bouquet.get(i).getLength() == maxLength) {
                result[i] = bouquet.get(i);
                i++;
            }
        }

        return result;
    }

}