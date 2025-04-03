package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;


public class FilterStringsByPrefixTest {

    @Test
    public void testFilterStringsByPrefix_Basic() {
        String[] arr = {"apple", "apricot", "banana", "ant", "art"};
        String prefix = "ap";
        String[] expected = {"apple", "apricot"};
        assertArrayEquals(expected, FilterStringsByPrefix.filterStringsByPrefix(arr, prefix));
    }

    @Test
    public void testFilterStringsByPrefix_NoMatches() {
        String[] arr = {"apple", "banana", "cherry"};
        String prefix = "z";
        String[] expected = {};
        assertArrayEquals(expected, FilterStringsByPrefix.filterStringsByPrefix(arr, prefix));
    }

    @Test
    public void testFilterStringsByPrefix_EmptyArray() {
        String[] arr = {};
        String prefix = "a";
        String[] expected = {};
        assertArrayEquals(expected, FilterStringsByPrefix.filterStringsByPrefix(arr, prefix));
    }

    @Test
    public void testFilterStringsByPrefix_EmptyPrefix() {
        String[] arr = {"apple", "banana", "cherry"};
        String prefix = "";
        String[] expected = {"apple", "banana", "cherry"}; // Empty prefix matches everything
        assertArrayEquals(expected, FilterStringsByPrefix.filterStringsByPrefix(arr, prefix));
    }

    @Test
    public void testFilterStringsByPrefix_SingleMatch() {
        String[] arr = {"apple", "banana", "cherry"};
        String prefix = "ban";
        String[] expected = {"banana"};
        assertArrayEquals(expected, FilterStringsByPrefix.filterStringsByPrefix(arr, prefix));
    }

    @Test
    public void testFilterStringsByPrefix_CaseSensitive() {
        String[] arr = {"Apple", "apple", "Banana", "banana"};
        String prefix = "A";
        String[] expected = {"Apple"}; // Case-sensitive!
        assertArrayEquals(expected, FilterStringsByPrefix.filterStringsByPrefix(arr, prefix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterStringsByPrefix_NullArray() {
        String[] arr = null;
        String prefix = "a";
        FilterStringsByPrefix.filterStringsByPrefix(arr, prefix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterStringsByPrefix_NullPrefix() {
        String[] arr = {"apple", "banana"};
        String prefix = null;
        FilterStringsByPrefix.filterStringsByPrefix(arr, prefix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFilterStringsByPrefix_BothNull() {
        String[] arr = null;
        String prefix = null;
        FilterStringsByPrefix.filterStringsByPrefix(arr, prefix);
    }
}
