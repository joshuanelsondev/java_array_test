package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConcatenateArraysTest {

    @Test
    public void testConcatenateArrays_Basic() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, ConcatenateArrays.concatenateArraysFunc(arr1, arr2));
    }

    @Test
    public void testConcatenateArrays_EmptyFirst() {
        int[] arr1 = {};
        int[] arr2 = {4, 5, 6};
        int[] expected = {4, 5, 6};
        assertArrayEquals(expected, ConcatenateArrays.concatenateArraysFunc(arr1, arr2));
    }

    @Test
    public void testConcatenateArrays_EmptySecond() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, ConcatenateArrays.concatenateArraysFunc(arr1, arr2));
    }

    @Test
    public void testConcatenateArrays_BothEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        assertArrayEquals(expected, ConcatenateArrays.concatenateArraysFunc(arr1, arr2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConcatenateArrays_NullFirst() {
        int[] arr1 = null;
        int[] arr2 = {4, 5, 6};
        ConcatenateArrays.concatenateArraysFunc(arr1, arr2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConcatenateArrays_NullSecond() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = null;
        ConcatenateArrays.concatenateArraysFunc(arr1, arr2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConcatenateArrays_BothNull() {
        int[] arr1 = null;
        int[] arr2 = null;
        ConcatenateArrays.concatenateArraysFunc(arr1, arr2);
    }

}
