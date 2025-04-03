package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class FindSecondLargestTest {
    @Test
    public void testFindSecondLargest_Basic() {
        int[] arr = {10, 5, 20, 15};
        assertEquals(15, FindSecondLargest.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargest_Duplicates() {
        int[] arr = {10, 10, 5, 15};
        assertEquals(10, FindSecondLargest.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargest_SortedAscending() {
        int[] arr = {5, 10, 15, 20};
        assertEquals(15, FindSecondLargest.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargest_SortedDescending() {
        int[] arr = {20, 15, 10, 5};
        assertEquals(15, FindSecondLargest.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargest_NegativeNumbers() {
        int[] arr = {-5, -10, -2, -8};
        assertEquals(-5, FindSecondLargest.findSecondLargest(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSecondLargest_AllSameElements() {
        int[] arr = {5, 5, 5, 5};
        FindSecondLargest.findSecondLargest(arr);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testFindSecondLargest_NullArray() {
        int[] arr = null;
        FindSecondLargest.findSecondLargest(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSecondLargest_TooFewElements() {
        int[] arr = {5};
        FindSecondLargest.findSecondLargest(arr);
    }
}


