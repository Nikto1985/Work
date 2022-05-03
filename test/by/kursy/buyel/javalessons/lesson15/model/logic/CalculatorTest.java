package by.kursy.buyel.javalessons.lesson15.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        // arrange
        int a = 10;
        int b = 3;
        int expected = 13;

        //act
        int actual = Calculator.sum(a, b);

        //assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testSub() {
        // arrange
        int a = 10;
        int b = 3;
        int expected = 7;

        //act
        int actual = Calculator.sub(a, b);

        //assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testMul() {
        // arrange
        int a = 10;
        int b = 3;
        int expected = 30;

        //act
        int actual = Calculator.mul(a, b);

        //assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testDiv() {
        // arrange
        int a = 12;
        int b = 3;
        int expected = 4;

        //act
        int actual = Calculator.div(a, b);

        //assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        // arrange
        int a = 12;
        int b = 0;


        //act
        int actual = Calculator.div(a, b);

        //assert

    }
    @Test(timeout = 1000)
    public void testMulByTimeout() {
        // arrange
        int a = 10;
        int b = 3;
               //act
        Calculator.mul(a, b);


        }
    }

