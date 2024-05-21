package org.example.summary_17_05_24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueElementsArrayTest {
    @Test
    public void testRemoveDuplicates() {
        int[] input = {0, 3, -2, 4, 3, 2};
        int[] expected = {0, 3, -2, 4, 2};
        int[] actual = UniqueElementsArray.removeDuplicates(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesAllUnique() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = UniqueElementsArray.removeDuplicates(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesAllSame() {
        int[] input = {3, 3, 3, 3, 3, 3};
        int[] expected = {3};
        int[] actual = UniqueElementsArray.removeDuplicates(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicatesEmpty() {
        int[] input = {};
        int[] expected = {};
        int[] actual = UniqueElementsArray.removeDuplicates(input);

        assertArrayEquals(expected, actual);
    }
}