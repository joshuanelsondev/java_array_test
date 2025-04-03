package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class removeDuplicatesFromSortedStringArrayTest {
    @Test
    public void testRemoveDuplicatesFromSortedStringArray_Basic() {
        String[] arr = {"apple", "apple", "banana", "banana", "cherry", "date", "date", "fig"};
        String[] expected = {"apple", "banana", "cherry", "date", "fig"};
        assertArrayEquals(expected, RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr));
    }

    @Test
    public void testRemoveDuplicatesFromSortedStringArray_NoDuplicates() {
        String[] arr = {"apple", "banana", "cherry", "date", "fig"};
        String[] expected = {"apple", "banana", "cherry", "date", "fig"};
        assertArrayEquals(expected, RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr));
    }

    @Test
    public void testRemoveDuplicatesFromSortedStringArray_AllDuplicates() {
        String[] arr = {"grape", "grape", "grape", "grape", "grape"};
        String[] expected = {"grape"};
        assertArrayEquals(expected, RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr));
    }

    @Test
    public void testRemoveDuplicatesFromSortedStringArray_EmptyArray() {
        String[] arr = {};
        String[] expected = {};
        assertArrayEquals(expected, RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr));
    }

    @Test
    public void testRemoveDuplicatesFromSortedStringArray_SingleElement() {
        String[] arr = {"kiwi"};
        String[] expected = {"kiwi"};
        assertArrayEquals(expected, RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr));
    }

    @Test
    public void testRemoveDuplicatesFromSortedStringArray_DuplicatesAtBeginning() {
        String[] arr = {"berry", "berry", "berry", "cherry", "date", "fig"};
        String[] expected = {"berry", "cherry", "date", "fig"};
        assertArrayEquals(expected, RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr));
    }

    @Test
    public void testRemoveDuplicatesFromSortedStringArray_DuplicatesAtEnd() {
        String[] arr = {"apple", "banana", "cherry", "date", "fig", "fig", "fig"};
        String[] expected = {"apple", "banana", "cherry", "date", "fig"};
        assertArrayEquals(expected, RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr));
    }

    @Test
    public void testRemoveDuplicatesFromSortedStringArray_MixedDuplicates() {
        String[] arr = {"apricot", "blackberry", "blackberry", "cantaloupe", "cantaloupe", "cantaloupe", "durian", "elderberry", "elderberry"};
        String[] expected = {"apricot", "blackberry", "cantaloupe", "durian", "elderberry"};
        assertArrayEquals(expected, RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveDuplicatesFromSortedStringArray_NullArray() {
        String[] arr = null;
        RemoveDuplicatesFromSortedStringArray.removeDuplicatesFromSortedStringArray(arr);
    }


}
