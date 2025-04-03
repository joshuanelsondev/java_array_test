package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindMaxTest {
    @Test
    public void testFindMax() {
        int[] arr1 = {5, 2, 9, 1, 5};
        assertEquals(9, FindMax.findMax(arr1));

        int[] arr2 = {-10, -5, -20};
        assertEquals(-5, FindMax.findMax(arr2));

        int[] arr3 = {7};
        assertEquals(7, FindMax.findMax(arr3));

        int[] arr4 = {0, 0, 0};
        assertEquals(0, FindMax.findMax(arr4));
    }
}
