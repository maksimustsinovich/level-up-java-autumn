package by.bsuir.levelup.lesson02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAndLoopsTest {

    @Test
    public void testBubbleSort_RegularCase() {
        int[] array = {5, 3, 8, 1, 2};
        ArraysAndLoops.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, array);
    }

    @Test
    public void testBubbleSort_AlreadySorted() {
        int[] array = {1, 2, 3, 4, 5};
        ArraysAndLoops.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testBubbleSort_EmptyArray() {
        int[] array = {};
        ArraysAndLoops.bubbleSort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testFindPrimes_RangeUpTo10() {
        List<Integer> primes = ArraysAndLoops.findPrimes(10);
        assertEquals(List.of(2, 3, 5, 7), primes);
    }

    @Test
    public void testFindPrimes_RangeUpTo20() {
        List<Integer> primes = ArraysAndLoops.findPrimes(20);
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), primes);
    }

    @Test
    public void testFindPrimes_NoPrimes() {
        List<Integer> primes = ArraysAndLoops.findPrimes(1);
        assertEquals(List.of(), primes);
    }

    @Test
    public void testCalculateStatistics_PositiveNumbers() {
        int[] numbers = {3, 5, 7, 2, 8};
        double[] result = ArraysAndLoops.calculateStatistics(numbers);
        assertEquals(8, result[0]);
        assertEquals(2, result[1]);
        assertEquals(5.0, result[2]);
    }

    @Test
    public void testCalculateStatistics_NegativeNumbers() {
        int[] numbers = {-1, -5, -3, -2};
        double[] result = ArraysAndLoops.calculateStatistics(numbers);
        assertEquals(-1, result[0]);
        assertEquals(-5, result[1]);
        assertEquals(-2.75, result[2]);
    }

    @Test
    public void testCalculateStatistics_EmptyArray() {
        int[] numbers = {};
        double[] result = ArraysAndLoops.calculateStatistics(numbers);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
    }

}