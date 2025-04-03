package org.example;
import org.junit.Test;
import static org.junit.Assert.*;



public class FilterEvenNumbersTest {
    @Test
    public void testFilterEvenNumbers_Basic() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, FilterEvenNumbers.filterEvenNumbersFunc(arr));
    }

    @Test
    public void testFilterEvenNumbers_OnlyEven() {
        int[] arr = {2, 4, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, FilterEvenNumbers.filterEvenNumbersFunc(arr));
    }

    @Test
    public void testFilterEvenNumbers_OnlyOdd() {
        int[] arr = {1, 3, 5};
        int[] expected = {};
        assertArrayEquals(expected, FilterEvenNumbers.filterEvenNumbersFunc(arr));
    }

    @Test
    public void testFilterEvenNumbers_EmptyArray() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, FilterEvenNumbers.filterEvenNumbersFunc(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterEvenNumbers_NullArray() {
        int[] arr = null;
        FilterEvenNumbers.filterEvenNumbersFunc(arr);
    }

}



