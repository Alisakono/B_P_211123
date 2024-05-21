package org.example.summary_17_05_24;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindGenericElementTest {
    @Test
    public void testFindGenericElement(){
        int[] array1 = {1, 2, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        int[] expected = {1,7};
        int[] actual = FindGenericElement.findGenericElement(array1,array2);

        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindGenericElementNoGeneric(){
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};

        int[] expected = {};
        int[] actual = FindGenericElement.findGenericElement(array1,array2);

        assertArrayEquals(expected,actual);
    }
    @Test
    public void testFindGenericElementWithDuplicates(){
        int[] array1 = {1,2,2,3,3,3};
        int[] array2 = {2,2,3,3,4};

        int[] expected = {2,3};
        int[] actual = FindGenericElement.findGenericElement(array1,array2);

        Arrays.sort(actual);
        assertArrayEquals(expected,actual);

    }

}