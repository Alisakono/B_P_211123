package org.example.summary_17_05_24;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CommonElementsFinderTest {
    @Test
    public void testCommonElementsFinder() {

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        Set<Integer> expected = Set.of(1, 7);
        Set<Integer> actual = CommonElementsFinder.findCommonElements(array1, array2);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindCommonElementsNoCommon() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        Set<Integer> expected = Set.of();
        Set<Integer> actual = CommonElementsFinder.findCommonElements(array1, array2);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindCommonElementsWithDuplicates() {
        int[] array1 = {1, 2, 2, 3, 3, 3};
        int[] array2 = {2, 2, 3, 3, 4};

        Set<Integer> expected = Set.of(2, 3);
        Set<Integer> actual = CommonElementsFinder.findCommonElements(array1, array2);

        assertEquals(expected, actual);

    }
}