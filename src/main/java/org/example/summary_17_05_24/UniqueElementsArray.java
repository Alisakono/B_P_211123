package org.example.summary_17_05_24;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueElementsArray {
    public static int[] removeDuplicates(int[] array){
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int element:array) {
            uniqueElements.add(element);
        }
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int element : uniqueElements){
            result[index++] = element;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0,3,-2,4,3,2};
        int[] result = removeDuplicates(array);
        System.out.println("example input:"+ Arrays.toString(array));

        System.out.println("example expected:"+Arrays.toString(result));
    }
}
         /*   4. Напишите программу на Java и тест для нее для удаления повторяющихся элементов из массива.
          example input:
          [0,3,-2,4,3,2]
          example expected:
          [0,3,-2,4,2]*/