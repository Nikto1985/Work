package by.kursy.buyel.javalessons.lesson18.ooptask.model.logic;

import by.kursy.buyel.javalessons.lesson18.ooptask.model.entity.Bouquet;
import by.kursy.buyel.javalessons.lesson18.ooptask.model.entity.Flower;
import org.junit.*;

import static org.junit.Assert.*;

public class ShopAssistanceTest {





    @Test
    public void testCalculateTotalPricePositive() {


        double expected = (ShopAssistance.LABOR_PERCENT + 1) * 15;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateTotalPriceWithNull() {
        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(null);

        assertEquals(expected, actual, 0.0);
    }

    private static Bouquet bouquet;
    public static void init(){
        Flower[] flowers = {
                new Flower("Rose", "red", 3.0, 100, 100),
                new Flower("Rose", "red", 3.0, 100, 100),
                new Flower("Rose", "red", 3.0, 100, 100),
                new Flower("Rose", "red", 3.0, 100, 100),
                new Flower("Rose", "red", 3.0, 100, 100),
        };
        bouquet = new Bouquet(flowers);

    }
    @AfterClass
    public static void destroy(){
    bouquet = null;
    }

    @Before
    public void connect(){
        System.out.println("connect to DataBase...");
    }

    @After
    public void disconnect(){
        System.out.println("disconnect to DataBase...");
    }



    @Test
    public void testCalculateTotalPriceWithEmptyObject() {
        Flower[] flowers = {};
        Bouquet bouquet = new Bouquet(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWeightPositive() {
        double expected = 500;

        double actual = ShopAssistance.calculateTotalWeight(bouquet);

        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testCalculateTotalWeightWithNull() {
        double expected = 0;

        double actual = ShopAssistance.calculateTotalWeight(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWeightWithEmptyObject() {
        Flower[] flowers = {};
        Bouquet bouquet = new Bouquet(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalWeight(bouquet);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void firstTestFindFlowersWithMaxLengthPositive(){
                Flower[] expected = {new Flower("Rose", "red", 3.0, 100, 130)};

        Flower[] actual = ShopAssistance.findFlowersWithMaxLength(bouquet);

        //assertArrayEquals(expected, actual);
        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLength() != actual[i].getLength()
                    || expected[i].getWeight() != actual[i].getWeight()
                    || expected[i].getPrice() != actual[i].getPrice()
                    || !expected[i].getName().equals(actual[i].getName())
                    || !expected[i].getColor().equals(actual[i].getColor())) {
                fail();
            }
        }
    }

    @Test
    public void secondTestFindFlowersWithMaxLengthPositive(){

        Flower[] expected = {new Flower("Rose", "red", 3.0, 100, 130)};

        Flower[] actual = ShopAssistance.findFlowersWithMaxLength(bouquet);

        //assertArrayEquals(expected, actual);
        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLength() != actual[i].getLength()
                    || expected[i].getWeight() != actual[i].getWeight()
                    || expected[i].getPrice() != actual[i].getPrice()
                    || !expected[i].getName().equals(actual[i].getName())
                    || !expected[i].getColor().equals(actual[i].getColor())) {
                fail();
            }
        }

    }
}