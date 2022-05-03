package by.kursy.buyel.javalessons.lesson15.model.logic;

// [1,2,3,4,5] -> [5,4,3,2,1]
// [1] -> [1]
// [1,2] -> [2,1]
// [3,3,3] -> [3,3,3]
// [] -> []
// null -> Exception

import org.junit.Assert;
import org.junit.Test;

public class ArrayWorkerTest {
    @Test
    public void testReverse(){
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++){
            Assert.assertEquals(expected[i], array[i]);
        }
    }
    @Test
    public void testReverse2(){
        int[] array = {1};
        int[] expected = {1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++){
            Assert.assertEquals(expected[i], array[i]);
        }
    }
    @Test
    public void testReverse3(){
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++){
            Assert.assertEquals(expected[i], array[i]);
        }
    }
    @Test
    public void testReverse4(){
        int[] array = {1, 2};
        int[] expected = {2, 1};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++){
            Assert.assertEquals(expected[i], array[i]);
        }
    }
    @Test
    public void testReverse5(){
        int[] array = {3, 3, 3};
        int[] expected = {3, 3, 3};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++){
            Assert.assertEquals(expected[i], array[i]);
        }
    }
    @Test
    public void testReverse6(){
        int[] array = {};
        int[] expected = {};

        ArrayWorker.reverse(array);

        for (int i = 0; i < array.length; i++){
            Assert.assertEquals(expected[i], array[i]);
        }
    }
    @Test()
    public void testReverse7(){
        int[] array = null;


        ArrayWorker.reverse(array);

        }
    }
